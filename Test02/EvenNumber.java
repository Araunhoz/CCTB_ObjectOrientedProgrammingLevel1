/*Q3.Write a Java program that takes a number as input from the user. 
  If the number is even, print "Even Number". Otherwise, print "Odd Number".
 */

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		System.out.println("Please insert a number: ");
	    Scanner input = new Scanner(System.in);
		int valor;
		valor = input.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("Even Number.");
			
		} else {
			System.out.println("Odd Number.");
		}
	    input.close();
	}
}
