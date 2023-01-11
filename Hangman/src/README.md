# Java Hangman

## Description

This is a version of the game Hangman that can be played in a Java console application.
The game randomly selects a word from a provided list in a text file when the game begins.
A row of underscores, representing letters in the word, will be printed to the console.
The user will then be asked to enter a letter or a word.
If the letter entered by the user is in the selected word the user the letter's location in the word will be shown.
If the letter is not in the word or the word guess is incorrect, a part of the hangman will be printed to the console.
The user should be able to guess wrong 7 times before they lose.
If all letters in the word are given by the user or the correct word is guessed a prompt will alert the user that they have won the game.

![Screenshot](screenshot.png)

## Specifications

Creating this java hangman game was one of the projects I completed whilst undertaking the \_nology tech consultancy program. This was assigned as the first java program and was due after one and a half weeks of completing lessons in basic java.

## Program Structure:

### Main Class

The main class if where the logic

### Random Word Selector Class

The random word selector is a class with static methods that handles the logic for creating a word list from a list in a provided text file and randomly selecting a word from that list.

### Hangman Word Class

The hangman word class is instansiated when the program begins with a randomly chosen word. A hangman word object keeps track of which letters in the selected word have been identified.

### Draw Hangman class

The draw hangman class is also instantiated when the program begins and keeps track of how many incorrect guesses have been made and displays the hangman image.
