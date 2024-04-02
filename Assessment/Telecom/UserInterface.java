package com.exam;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Telecom Billing System");
            System.out.println("Enter your choice:");
            System.out.println("1. View Call Details");
            System.out.println("2. Generate Invoice");
            System.out.println("3. Exit");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    CallDetailsPresenter.displayCallDetails();
                    break;
                case 2:
                    InvoiceGenerator.generateInvoice();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please choose a valid option.");
            }
        }

        scanner.close();
    }
}