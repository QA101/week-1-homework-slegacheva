import java.util.Scanner;

public class DivisibleProgram {

	/*
	 * Define a program that determines whether a number x is divisible by a number y.
	 * 
	 * If x is divisble by y, the program will print TRUE otherwise FALSE
	 * 
	 * Such as:
	 * x -> 10
	 * y -> 5
	 * 10 divided by 5 is 2 with 0 remainder. The program would print true
	 */
	public static void main(String args[]){
		Scanner console  = new Scanner (System.in);
		System.out.print("Input x: ");
		int x = console.nextInt();
		System.out.print("Input y: ");
		int y = console.nextInt();
		
		if (x % y == 0) {
			System.out.print(" True");
			} else {
				System.out.print("False");
			}
			}
		
	}

