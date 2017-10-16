import java.util.Scanner;

public class BetweenProgram {

	/*
	 * Write a program that determine if a number x is between 2 numbers y and z
	 * if x is between y and z, print TRUE otherwise print FALSE
	 * 
	 * example:
	 * x = 150
	 * y = 100
	 * z = 200
	 * should print TRUE
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner console  = new Scanner (System.in);
System.out.print("Input x: ");
int x = console.nextInt();
System.out.print("Input y: ");
int y = console.nextInt();
System.out.print("Input z: ");
int z = console.nextInt();

if (x < y) { 
	
	if (x < z) {
		System.out.print("True");
		} else {
			System.out.print("False");
			}	
}
else 
{System.out.print("False");}
	}
}


