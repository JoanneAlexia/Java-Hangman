package Hangman;

import java.util.ArrayList;

public class HangmanWord {
	private String selectedWord = null;
	//displayWord: An array list of the selected word as displayed to player.Underscores represent the unidentified letters. Identified letters will appear in array. 
	private ArrayList<Character> displayWord= new ArrayList<Character>();
	private int numberIdentifiedLetters; 
	private boolean allLettersIdentified;
	
	public HangmanWord(String word) {
		this.selectedWord = word; 
		this.displayWord = initialiseDisplayWord(word);
		this.numberIdentifiedLetters = 0; 
		this.allLettersIdentified = false;
	}
	
	//Upon instantiation an array list of underscores, the length of the selected word, is created.  
	private ArrayList<Character> initialiseDisplayWord(String word){
		ArrayList<Character> displayWord = new ArrayList<Character>();
		for(int i=0;i<word.length();i++) {
			displayWord.add('_');
		}
		return displayWord;
	}
	
	/*Prints to console the progress of the guessed word */
	public void printDisplayWord(){
		String displayString = "";
		for(int i=0;i<this.displayWord.size() ;i++) {
			displayString += this.displayWord.get(i).toString()+" ";
		}
		System.out.println("\n"+displayString+"\n");
	}
	
	/*Function checks if letter argument is in the selected word. If it is it changes the displayed
	word so that the correctly chosen letter appears*/
	public boolean checkLetter(char letter) {
		boolean letterInWord = false; 
		for(int i=0; i<this.selectedWord.length(); i++) {
			
			if(selectedWord.charAt(i)==letter && !displayWord.contains(letter)) {
				displayWord.set(i,letter);
				letterInWord = true;
				this.numberIdentifiedLetters+=1; 
			}
		}
		
		if(this.numberIdentifiedLetters==this.selectedWord.length()) {
			this.allLettersIdentified = true;
			
		}
		return letterInWord; 
	}
	
	public boolean checkWord(String word) {
		boolean wordCorrect = false;
		if(word.equals(this.selectedWord)){
			this.allLettersIdentified = true;
			for(int i=0; i< displayWord.size(); i++) {
				displayWord.set(i, word.charAt(i));
			}
			wordCorrect = true;
		}
		return wordCorrect;
	}
	
	public boolean getAllLettersIdentified() {
		return this.allLettersIdentified;
	}
	
	public String getSelectedWord() {
		return this.selectedWord;
	}

}
