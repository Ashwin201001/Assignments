package ashwins;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class TextFileHandler {
   public static Map<String, String> loadCsvFileToMap(String filePath) {
       Map<String, String> countryCapitalMap = new HashMap<>();
       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] parts = line.split(",", 2);
               if (parts.length == 2) {
                   countryCapitalMap.put(parts[0].trim(), parts[1].trim());
               }
           }
       } catch (IOException e) {
           System.err.println("Error reading file: " + e.getMessage());
       }
       return countryCapitalMap;
   }
}