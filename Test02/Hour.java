/*Q2.Write a Java program that asks the user for their name and the current hour 
 * (in 24-hour format). If the hour is between 5 and 12, print "Good morning, [name]!".
 *  If the hour is between 13 and 18, print "Good afternoon, [name]!".
 *   If the hour is between 19 and 4, print "Good night, [name]!"
 
  */

import java.util.Scanner;

public class Hour {
	
	public static void main(String[] args) {
		System.out.println("What is your name?");
	    Scanner input = new Scanner(System.in);
	    String name;
		name = input.next();
		
		System.out.println("What time is it?");
	    Scanner in = new Scanner(System.in);
	    int hour;
		hour = in.nextInt();
		
		if(hour>=5 && hour <=12) {
			System.out.printf("Good morning, [%s]!",name);
		} else {
			if(hour>=13 && hour<=18) {
				System.out.printf("Good evening, [%s]",name);
			} else {				 
					System.out.printf("Good night, [%s]!",name);					
				
			}
		}
		input.close();
		in.close();
	}
}
