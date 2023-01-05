package Hangman;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		boolean gameFinished=false; 
		
		//Select random word using random word selector class
		//Create instance of WordProgress class 
		HangmanWord word = new HangmanWord("hello");
		System.out.println(word.printDisplayWord());
		
		//Prompt user to enter letter
		System.out.println("Please enter a letter:");
		Scanner keyboard = new Scanner(System.in);
		char input1 = keyboard.next().charAt(0);
		System.out.printf("You selected %s%n",input1);

		//Check if letter is in word 
		word.checkLetter(input1);
		System.out.println(word.printDisplayWord());
		
		//Hangman image 
		
	}

}
