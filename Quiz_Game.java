package asish.internship.TechnoInternship;

import java.util.Scanner;

public class Quiz_Game {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			String[] questions = {
			    "What is the capital of France?",
			    "Which planet is known as the Red Planet?",
			    "What is the largest mammal in the world?"
			};

			String[][] choices = {
			    {"A) London", "B) Berlin", "C) Paris", "D) Madrid"},
			    {"A) Earth", "B) Mars", "C) Jupiter", "D) Venus"},
			    {"A) African elephant", "B) Blue whale", "C) Giraffe", "D) Rhinoceros"}
			};

			char[] correctAnswers = {'C', 'B', 'B'};
			int score = 0;

			for (int i = 0; i < questions.length; i++) {
			    System.out.println("Question " + (i + 1) + ": " + questions[i]);
			    
			    for (String choice : choices[i]) {
			        System.out.println(choice);
			    }

			    System.out.print("Your answer: ");
			    char userAnswer = scanner.next().toUpperCase().charAt(0);

			    if (userAnswer == correctAnswers[i]) {
			        System.out.println("Correct!\n");
			        score++;
			    } else {
			        System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
			    }
			}

			System.out.println("Quiz completed!");
			System.out.println("Your score: " + score + " out of " + questions.length);
		}
 
    }
}
