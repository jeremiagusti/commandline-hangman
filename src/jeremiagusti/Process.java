package jeremiagusti;

public class Process {
	private char[] chosenWord;
	private int[] recordedAnswer;
	private int guessedLetter = 0;
	
	public Process(char[] chosenWord) {
		this.chosenWord = chosenWord;
		this.recordedAnswer = new int[this.chosenWord.length];
		
		for (int i = 0; i < recordedAnswer.length; i++) {
			recordedAnswer[i] = 0;
		}
	}
	
	public int isThere(char guess) {		
		int match = 0;
		
		// Checking the letter
		for (int i = 0; i < chosenWord.length; i++) {
			if (guess == chosenWord[i]) {
				recordedAnswer[i] = 1;
				match++;
				guessedLetter++;
			} 			
		}		

		if (match == 0) { return 0; } 
		else { return 1; }
	}
	
	public void displayInitialLine() {
		for (int i = 0; i < chosenWord.length; i++) {
			System.out.print("_ ");
		}
		System.out.println("");
	}
	
	public boolean isWin() {
		if (guessedLetter == chosenWord.length)	{ return true; } 
		else { return false; }
	}	
	
	public void displayLetters() {
		for (int i = 0; i < recordedAnswer.length; i++) {
			if (recordedAnswer[i] == 1) {
				System.out.print(chosenWord[i]);
			} else {
				System.out.print("_ ");
			}
		}	
		
		System.out.println("");
	}
}
