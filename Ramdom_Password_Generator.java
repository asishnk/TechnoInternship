package asish.internship;

import java.util.Random;
public class Ramdom_Password_Generator {

	public static void main(String[] args) {
		String Upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lower ="abcdefghijklmnopqrstuvwxyz";
		String Num ="1234567890";
		String Specialchars ="!@#$%^&*-/><";
		String combination = Upper+Lower+Num+Specialchars;
		
		int length =8;
		char[] password = new char[length];
		Random r = new Random();
		
		for(int i=0;i<length;i++){
			password[i] = combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Generated Password is: " + new String(password));

	}

}
