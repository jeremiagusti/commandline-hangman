package jeremiagusti;

public class WordList {
	String[] wordList = 
		{
			"main", 
			"car", 
			"food",
			"phone",
			"internet"
		};
	
	private String getRandomWord() {
		int indexOfWord = (int) (Math.random() * wordList.length) + 1;
		String chosenWord = wordList[indexOfWord];
		
		return chosenWord;
	}
	
	private char[] makeArray(String chosenWord) {
		char[] slicedWord = new char[chosenWord.length()];
		
		return slicedWord;
	}
	
	public char[] getArrayWord() {
		String word = getRandomWord();
		
		// Make an array for sliced word 
		char[] slicedWordArray = makeArray(word);
		
		// Assign letters to new array
		for (int i = 0; i < word.length(); i++) {
			slicedWordArray[i] = word.charAt(i);
		}
		
		return slicedWordArray;
	}
	
}
