package Hangman;

import java.util.ArrayList;

public class HangmanWord {
	private String selectedWord = null;
	//displayWord: An array list of the selected word as displayed to player.Underscores represent the unidentified letters. Identified letters will appear in array. 
	private ArrayList<Character> displayWord= new ArrayList<Character>();   
	
	public HangmanWord(String word) {
		this.selectedWord = word; 
		this.displayWord = initialiseDisplayWord(word);
	}
	
	//Upon instansiation an array list of underscores the length of the selected word is created.  
	private ArrayList<Character> initialiseDisplayWord(String word){
		ArrayList<Character> displayWord = new ArrayList<Character>();
		for(int i=0;i<word.length();i++) {
			displayWord.add('_');
		}
		return displayWord;
	}
	
	/*Prints to console the progress of the guessed word */
	public String printDisplayWord(){
		String displayString = "";
		for(int i=0;i<this.displayWord.size() ;i++) {
			displayString += this.displayWord.get(i).toString()+" ";
		}
		return displayString;
	}
	
	/*Function checks if letter argument is in the selected word. If it is it changes the displayed
	word so that the correctly chosen letter appears*/
	public boolean checkLetter(char letter) {
		boolean letterInWord = false; 
		for(int i=0; i<this.selectedWord.length(); i++) {
			if(selectedWord.charAt(i)==letter) {
				displayWord.set(i,letter);
				letterInWord = true;
			}
		}
		return letterInWord; 
	}

}
