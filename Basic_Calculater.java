package asish.internship;

import java.util.Scanner;
public class Basic_Calculater {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number:");
			double num1 = sc.nextInt();
			
			System.out.println("Enter the second number:");
			double num2 = sc.nextInt();
			
			System.out.println("Select Operation");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			int operation = sc.nextInt();
			
			double result = 0;
			
			switch(operation){
				case 1:
					result = num1+num2;
					break;
				case 2:
					result = num1-num2;
					break;
				case 3:
					result = num1*num2;
				case 4:
					if((num2!=0)) {
					result = num1/num2;
					}
					else {
						System.out.println("can't divide by 0");
						return;
					}
					break;
					default:
						System.out.println("Invalid Operation");
						return;
			}
			System.out.println("Result:" + result);
		}
		

	}

}
