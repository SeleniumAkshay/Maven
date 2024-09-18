package Selenium1;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Csv_new {
	
	public static void main(String[] args) throws IOException, CsvException {
		
		FileReader file=new FileReader("./Data/Book1.csv");
		CSVReader reader=new CSVReader(file);
		
		
		String[] value = reader.readNext();
		for (String string : value) {
			System.out.println(string);
		}
		
//		List<String[]> value = reader.readAll();
//		for (String[] string : value) {
//			for (String strings : string) {
//				System.out.println(strings);
//			}
//			
//		}
		
	}

}
