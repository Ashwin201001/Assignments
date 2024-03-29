package ashwins;

import java.util.Map;

public class TextFileHandlerMain {
	   public static void main(String[] args) {
	       String filePath = "D:/country 1.csv"; // Change to the path of your CSV file
	       Map<String, String> countryCapitalMap = TextFileHandler.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }
	}