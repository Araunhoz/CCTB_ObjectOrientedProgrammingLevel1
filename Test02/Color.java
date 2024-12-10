/*Q4.Write a Java program that asks the user for their favorite 
 * color and then prints a message saying "Your favorite color is: [color]". */

import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
		System.out.println("What is your favorite color? ");
	    Scanner input = new Scanner(System.in);
	    String message;
		message = input.next();
	
		System.out.printf("Your favorite color is:[%s]\n",message);
	    input.close();
	
	}
}
