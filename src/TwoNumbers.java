import java.util.Scanner;

public class TwoNumbers {

	public static void main(String args[]){
		Scanner console  = new Scanner (System.in);
		System.out.print("Input x: ");
		double x = console.nextInt();
		System.out.print("Input y: ");
		double y = console.nextInt();
		System.out.println( );
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + x*y);
		System.out.println("x / y = " + x/y);
		
		if (x > y) {
			System.out.print(" x > y - True");
			} else {
				if (x ==y) {
					System.out.println( "x = y");
				}
				else {
					System.out.print(" x > y - False");	
				}
			
			}
			}
		
}
