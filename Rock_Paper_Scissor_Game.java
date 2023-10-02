package asish.internship.TechnoInternship;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 0 for Rock , 1 for Paper and 2 for Scissor");
			int userInput = sc.nextInt();
			if(userInput>2) {
				System.out.println("Invlid Choice ......Play Again and choice 0 or 1 or 2");
				return;
			}
			
			Random r = new Random();
			int computerInput = r.nextInt(3);
			
			if(userInput==computerInput) {
				System.out.println("Draw");
			}
			else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
				System.out.println("You Win");
			}
			else {
				System.out.println("Computer Win");
			}
			System.out.println("Computer Choice is: " + computerInput);
			
			if(computerInput==0) {
				System.out.println("Computer Choice: Rock ");
			}
			else if(computerInput==1) {
				System.out.println("Computer Choice: Paper ");
			}
			else if(computerInput==2) {
				System.out.println("Computer Choice: Scissor ");
			}
		}

	}

}
