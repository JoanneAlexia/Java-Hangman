package Hangman;

import java.util.ArrayList;
import java.util.Arrays;

public class drawHangman {
	private int incorrectGuesses = 0; //Keeps track of how many wrong guess
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
	}
	
	//Displays hangman image based on number of incorrect guesses
	public void displayHangman() {
		for(int i=0; i<hangmanImages.get(incorrectGuesses).size();i++) {
			System.out.println(this.hangmanImages.get(this.incorrectGuesses).get(hangmanImages.get(incorrectGuesses).size()-1-i));
		}
		if(this.incorrectGuesses>=6) {
			System.out.println("\nG A M E    O V E R");
			System.out.println(" Y O U    L O S T");
		}
		this.incorrectGuesses++; 
	}
	
	
}

