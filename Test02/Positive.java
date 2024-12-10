/*Q1.Write a Java program that asks the user to enter a number. If the number is positive,
 *  print "Positive Number". If the number is negative, print "Negative Number". 
 *  If the number is zero, print "Zero".
 * 
 *  */

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		
		System.out.println("Please insert a number: ");
	    Scanner input = new Scanner(System.in);
		int valor;
	    
	    valor = input.nextInt();
	    
		if(valor == 0) {			
			System.out.println("Zero");		
		} else {
			if(valor<0) {			
				System.out.println("Negative number");		
			} else {
				if(valor>0) {	
					System.out.println("Positive number");	
				}
			}
	     input.close();	
		}		
	}
}
