package asish.internship.TechnoInternship;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
	public static void main(String[] args) {
	
	 try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();
			
			int targetNumber = random.nextInt(100) + 1;
			int userGuess;
			int numGuesses = 0;

			System.out.println("I have selected a number between 1 and 100. Try to guess it.");
			
			do {
			    System.out.print("Enter your guess: ");
			    userGuess = scanner.nextInt();
			    numGuesses++;
			    
			    if (userGuess < targetNumber) {
			    	System.out.println("You guesse too Low.......");
			        System.out.println("Guesse a higher number:");
			    } else if (userGuess > targetNumber) {
			    	System.out.println("You guesse too High.......");
			        System.out.println("Guesse a lower number:");
			    } else {
			        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
			    }
			} while (userGuess != targetNumber);
		}
     
 }
 
}


