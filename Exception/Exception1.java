package ashwins;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		int[] counts=new int [26];
		Scanner scan = new Scanner(System.in);
		//get word from user
		System.out.print("Enter a single word (letters only, please): ");
		String word =scan.nextLine();
		//convert to all upper case
		word= word.toUpperCase();
		//count frequency of each letter in string
		try {
		for (int i=0; i < word.length(); i++){
			counts [word.charAt(i)-'A']++;
		}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Not a Letter "+a);
		}
		//print frequencies
		System.out.println();
		for (int i=0; i<counts.length; i++) {
			if (counts [i] != 0);
			System.out.println((char) (i+'A')+":"+ counts[i]);
		}
	}
}