package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest7 {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jParser = new JSONParser();

        JSONArray a = (JSONArray) jParser.parse(new FileReader("resources/sample7.json"));
        int i=1;
        for (Object o : a) {
            JSONObject person = (JSONObject) o;
            System.out.println("Person : "+i);
            String name = (String) person.get("name");
            System.out.println("Name: "+name);

            String city = (String) person.get("city");
            System.out.println("City : "+city);

            String job = (String) person.get("job");
            System.out.println("Job: "+job);

            JSONArray cars = (JSONArray) person.get("cars");
            int j=1;
            for (Object c : cars) {
                System.out.println("Car "+j+": "+c + "");
                j++;
            }

            System.out.println("_________");
            i++;
        }

    }
}