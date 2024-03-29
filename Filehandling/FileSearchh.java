import java.io.File;
import java.util.Scanner;
public class FileSearch {
   public static void main(String[] args) {
	   
       // Create a Scanner object to read user input from the console
       
	   Scanner scanner = new Scanner(System.in);
       
	   // Prompt the user to enter the directory path
       
	   System.out.print("Enter the directory path: ");
       String directoryPath = scanner.nextLine();
       // Prompt the user to enter the file extension
       System.out.print("Enter the file extension (e.g., txt, java): ");
       String extension = scanner.nextLine();
       // Create a File object for the search directory
       File searchDirectory = new File(directoryPath);
       // Check if the search directory exists
       if (!searchDirectory.exists() || !searchDirectory.isDirectory()) {
           System.out.println("Error: The specified directory does not exist or is not a directory.");
           return;
       }
       // List files in the directory matching the specified extension
       File[] files = searchDirectory.listFiles();
       // Check if any files matching the extension were found
       boolean found = false;
       if (files != null) {
           for (File file : files) {
               if (file.getName().endsWith(extension)) {
                   found = true;
                   System.out.println(file.getAbsolutePath());
               }
           }
       }
       // If no files with the specified extension were found
       if (!found) {
           System.out.println("No files with extension '" + extension + "' found in directory '" + directoryPath + "'.");
       }
       // Close the scanner to release resources
       scanner.close();
   }
