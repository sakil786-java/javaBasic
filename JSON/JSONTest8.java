package JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONTest8 {
    public static void main(String[] args) throws IOException, ParseException {


        JSONParser jParser = new JSONParser();
        JSONObject b = (JSONObject) jParser.parse(new FileReader("C:/Users/Sakil Laskar/IdeaProjects/Global_Id_JDBC/src/main/java/JSON/emp.json"));
        JSONObject a= (JSONObject) b.get("employee");
        String name= (String) a.get("name");
        String role= (String) a.get("role");

        System.out.println(name+" "+role);
        System.out.println(b);
        System.out.println(a);
    }
}