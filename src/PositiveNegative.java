import java.util.Scanner;

public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	public static void main(String args[]){
		Scanner console  = new Scanner (System.in);
		System.out.print("Input number: ");
		int number = console.nextInt();
		
		if (number > 0) {
				System.out.print("number is positive");	
				}
			else {
				if (number == 0) {
			System.out.print(" number is 0");
		} else {
			System.out.print("number is negative");
		}
		}
		
		
	}
}

