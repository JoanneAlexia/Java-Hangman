package Hangman;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class RandomWordSelector {
	private static ArrayList<String> wordList = new ArrayList<>();
	private static Scanner inputStream; 

	public static String generateRandomWord() {
		//Create wordList from text file input
		try {
		inputStream = new Scanner(new FileInputStream("wordslist.txt"));
		}catch(FileNotFoundException e){
			System.out.println("File wordlist.txt not found");
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			wordList.add(inputStream.nextLine().replaceAll("[^a-zA-Z]", ""));
		}
		
		//Select random word from list
		Random rand = new Random();
		return wordList.get(rand.nextInt(wordList.size()-1));
	}


}
