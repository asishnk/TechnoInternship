package asish.internship.TechnoInternship;

import java.util.Random;
import java.util.Scanner;

public class Dice_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			Random r = new Random();
			
			System.out.println("How many time roll the dice:");
			int rollCount = sc.nextInt();
			
			for(int i=0; i<rollCount; i++) {
				int dice1 = r.nextInt(6) +1;
				int dice2 = r.nextInt(6) +1;
				
				System.out.println("rolling the dice" +dice1+"and it is"+dice2);
			}
		}

	}

}
