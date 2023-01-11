package Hangman;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {		
		//Select random word using random word selector class
		
		//Initialization
		HangmanWord word = new HangmanWord(RandomWordSelector.generateRandomWord());
		drawHangman hangman = new drawHangman();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("-------------\nH A N G M A N\n-------------");

		while(!hangman.getLostGame() && !word.getAllLettersIdentified()) {
			word.printDisplayWord(); //Display word progress to player
			
			System.out.println("Please enter a letter or word:"); //Prompt user to enter letter or word
			String input = keyboard.next();
			System.out.printf("You chose %s.%n%n",input);
			
			boolean letterCorrect = false;
			boolean wordCorrect = false;
			if(input.length() == 1) {
				letterCorrect = word.checkLetter(input.charAt(0)); //Check if letter is in word 
				if(!letterCorrect) {
					System.out.printf("Bad Luck! %s is not in the selected word.%n",input);
				}
			}else {
				wordCorrect = word.checkWord(input);
				if(!wordCorrect) {
					System.out.printf("Bad Luck! %s is not the selected word.%n",input);
				}
			}

			//Display outcome
			if(letterCorrect && !word.getAllLettersIdentified()) { //won by selecting all letters
				System.out.printf("Good Job! %s is in the selected word.%n",input);
			}else if(word.getAllLettersIdentified()) { //won by selecting word
				System.out.println("Correct! The selected word was");
				word.printDisplayWord();
				System.out.printf("C O N G R A T U L A T I O N S,  Y O U  W O N!");
			}else {//incorrect guess
				hangman.displayHangman();
				if(hangman.getLostGame()) {
					System.out.printf("%nThe selected word was %s%n",word.getSelectedWord());
				}
			}
	
		}
		
		keyboard.close();

	}

}
