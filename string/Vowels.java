package com.ashwin;

public class Vowels {
	   public static void main(String[] args) {
	       String inputString = "Hello World";
	       int[] counts = countConsonantsAndVowels(inputString);
	  	   System.out.println("Number of consonants: " + counts[0]);
	       System.out.println("Number of vowels: " + counts[1]);
	   }
	   public static int[] countConsonantsAndVowels(String str) {
	       int numConsonants = 0;
	       int numVowels = 0;
	       str = str.toLowerCase(); // Convert the string to lowercase for easier comparison
	       for (int i = 0; i < str.length(); i++) {
	           char ch = str.charAt(i);
	           if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
	               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                   numVowels++;
	               } else {
	                   numConsonants++;
	               }
	           }
	       }
	       return new int[]{numConsonants, numVowels};
	   }
	}
