package ashwins;

import java.io.File;
public class FileSearchh {
   public static void main(String[] args) {
       if (args.length != 2) {
           System.out.println("Usage: java FileSearch");
           return;
       }
       File[] files = new File(args[0]).listFiles((dir, name) -> name.endsWith(args[1]));
       if (files != null) {
           for (File file : files) {
               System.out.println(file.getAbsolutePath());
           }
       } else {
           System.out.println("Error: The specified directory does not exist or is empty.");
       }
   }
}