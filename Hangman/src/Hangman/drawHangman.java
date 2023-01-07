package Hangman;

import java.util.ArrayList;
import java.util.Arrays;

public class drawHangman {
	private int incorrectGuesses; //Keeps track of how many wrong guess
	private int maxIncorrectGuesses; //Keeps track of how many wrong guess
	private boolean lostGame;
	private ArrayList<ArrayList> hangmanImages = new ArrayList<ArrayList>(); //Keeps all iterations of hangman images
	
	public drawHangman() {
		//Hangman images added to arraylist
		hangmanImages.add(new ArrayList<String>(Arrays.asList( "___|___")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |","   |","   |","   |","   |","   |")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |","   |","   |","   |","   |","   |","____________")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |","   |","   |","   |","   |        O","   |        |","____________")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |","   |","   |        |","   |        |","   |        O","   |        |","____________")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |","   |","   |        |","   |      \\/|\\/","   |        O","   |        |","____________")));
		hangmanImages.add(new ArrayList<String>(Arrays.asList("___|___","   |","   |      /   \\","   |       / \\","   |        |","   |      \\/|\\/","   |        O","   |        |","____________")));
		this.incorrectGuesses = 0;
		this.maxIncorrectGuesses = hangmanImages.size();
		this.lostGame = false;
		
	}
	
	//Displays hangman image based on number of incorrect guesses
	public void displayHangman() {
		System.out.println();
		for(int i=0; i<hangmanImages.get(incorrectGuesses).size();i++) {
			System.out.println(this.hangmanImages.get(this.incorrectGuesses).get(hangmanImages.get(incorrectGuesses).size()-1-i));
		}
		this.incorrectGuesses++;
		if(this.incorrectGuesses>=this.maxIncorrectGuesses) {
			this.lostGame = true;
			System.out.println("\nG A M E    O V E R");
			System.out.println(" Y O U    L O S T");
		}
		
	}
	
	public boolean getLostGame() {
		return this.lostGame;
		
	}
	
	
}

