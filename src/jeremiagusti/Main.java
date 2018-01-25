package jeremiagusti;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String guess;
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Welcome to the hangman game!");
		
		Player player = new Player(9);
		System.out.println("Let's play!");
		
		WordList word = new WordList();
		char[] chosenWord = word.getArrayWord();
		Process process = new Process(chosenWord);
		
		process.displayInitialLine();
		
		while (true) {
			System.out.print("Enter your guess: ");
			guess = userIn.nextLine();
			switch(process.isThere(guess.charAt(0))) {
				case 0: 
					player.decreaseLife();
					break; 
				case 1: 
					break;
			}
			System.out.println(" ");
			process.displayLetters();
			
			// Check if the player already win the game or not
			if (process.isWin()) 
			{
				System.out.println("\n\nYou WIN!!!");
				System.out.print("The word is: ");
				process.displayLetters();
				userIn.close();
				break;
			} 
			else 
			{
				if (player.getLife() == 0) {
					System.out.println("You run out of life!");
					userIn.close();
					break;
				} else {
					System.out.println("You have " + player.getLife() + " life remaining.");
					continue;	
				}
			}
		}
	}
}
