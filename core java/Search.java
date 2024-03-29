package com.ashwin;
public class Search extends FindIndex{
public static void main(String[] args) {
    int[] myArray = {5, 4, 6, 1, 3, 2, 7, 8, 9};
    System.out.println("Index position of 5 is: " + findIndex(myArray, 5));
    System.out.println("Index position of 7 is: " + findIndex(myArray, 7));
}
}
