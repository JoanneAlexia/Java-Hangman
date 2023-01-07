package Hangman;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {		
		//Select random word using random word selector class
		
		//Initialization
		HangmanWord word = new HangmanWord("hello");
		drawHangman hangman = new drawHangman();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("-------------\nH A N G M A N\n-------------");
		
		while(!hangman.getLostGame() && !word.getAllLettersIdentified()) {
			word.printDisplayWord(); //Display word progress to player
			
			System.out.println("Please enter a letter:"); //Prompt user to enter letter
			char input1 = keyboard.next().charAt(0);
			
			boolean letterCorrect = word.checkLetter(input1); //Check if letter is in word 
			System.out.printf("You selected %s.%n%n",input1);
			
			//Display outcome
			if(letterCorrect) {
				if(!word.getAllLettersIdentified()) {
					System.out.printf("Good Job! %s is in the selected word.%n",input1);
				}
				else {
					System.out.println("Correct! The selected word was");
					word.printDisplayWord();
					System.out.printf("C O N G R A T U L A T I O N S,  Y O U  W O N!");
				}
				
			}else {
				System.out.printf("Bad Luck! %s is not in the selected word.%n",input1);
				hangman.displayHangman();
			}
	
		}


	}

}
