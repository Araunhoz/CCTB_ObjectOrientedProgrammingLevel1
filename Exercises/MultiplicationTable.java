import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		//Initialize Scanner object
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to generate the Multiplication Table: ");
		
		//Num receives the number inputed by the user
		int num = scan.nextInt();
		
		//Loop to calculate the multiplication table
		for (int i = 1; i <= 10; i++) 
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		
		scan.close();
		
		
	}

}
