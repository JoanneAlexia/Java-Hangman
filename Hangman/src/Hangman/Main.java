package Hangman;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {		
		//Select random word using random word selector class
		
		//Create instance of WordProgress class 
		HangmanWord word = new HangmanWord("hello");
		System.out.println(word.printDisplayWord());
		
		//Prompt user to enter letter
		System.out.println("Please enter a letter:");
		Scanner keyboard = new Scanner(System.in);
		char input1 = keyboard.next().charAt(0);
		

		//Check if letter is in word 
		word.checkLetter(input1);
		System.out.printf("You selected %s.%n",input1);
		if(word.checkLetter(input1)) {
			System.out.printf("Good Job! %s is in the selected word.%n",input1);
		}else {
			System.out.printf("Bad Luck! %s is not in the selected word.%n",input1);
		}
		System.out.println(word.printDisplayWord());
		//Hangman image 
		
		drawHangman hangman = new drawHangman();
		hangman.displayHangman();
		hangman.displayHangman();
		hangman.displayHangman();
		hangman.displayHangman();
		hangman.displayHangman();
		hangman.displayHangman();
		hangman.displayHangman();


	}

}
