package Selenium1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_new {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file = new FileReader("./Data/Demo1.json");
		JSONParser parser = new JSONParser();
		Object values = parser.parse(file);
		JSONObject value = (JSONObject) values;
		System.out.println(value.get("name"));
		Object map = value.get("hobbies");
		System.out.println(map);
		JSONArray array = (JSONArray) map;
		System.out.println(array.get(0));
		System.out.println(array.get(1));

		System.out.println(value.get("songs"));

		Object songs = value.get("songs");
		JSONObject s = (JSONObject) songs;
		System.out.println(s.get("song"));
		System.out.println(s.get("song1"));
		
		Object car = value.get("cars");
		array=(JSONArray) car;
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		
		s=(JSONObject) array.get(1);
		System.out.println(s.get("car1"));
		

	}

}
