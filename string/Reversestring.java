package com.ashwin;

public class Reversestring{

	public static void main(String[] args) {
		String str = "Ashwin";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
}

