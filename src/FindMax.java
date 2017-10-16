import java.util.Scanner;

public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console  = new Scanner (System.in);
		System.out.print("Input x: ");
		int x = console.nextInt();
		System.out.print("Input y: ");
		int y = console.nextInt();
		
		if (x > y) {
			System.out.print("x"+ " is Maximum");
		} else {
			if (x == y) {
				System.out.print("x" + " = " + "y");
			} else {
				System.out.print("y" + " is Maximum");
			}
		}
	}

}
