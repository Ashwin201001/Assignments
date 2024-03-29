package ashwins;

import java.util.Map;

public class Countrymapmain {
	 
	public static void main(String[] args) {
		System.out.println("Question 3 : ");
		//3
		String filePath = "D:\\country 1.csv";
	    Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
	    char startsWith = 'I'; // no country name start with s actually
	    String outputFile = "D:\\countrytext.txt";
	    CountryMap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	    System.out.println("Filtered countries have been written to the file.");
	}
 
}