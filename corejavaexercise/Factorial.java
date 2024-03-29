package ashwins;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		String KeepGoing = "Y";
		Scanner scan = new Scanner(System.in);
		
		while (KeepGoing.equals("Y") || KeepGoing.equals("y")) {
			System.out.print("Enter an Integer: ");
			int val = scan.nextInt();
			System.out.println ("Factorial(" + val + ") = "+ MathUtils.factorial(val));
					System.out.print ("Another factorial? (y/n) ");
					KeepGoing = scan. next () ;
		}
	}
}