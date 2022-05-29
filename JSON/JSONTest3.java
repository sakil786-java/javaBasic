package JSON;
//Read JSON file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest3 {
    public static void main(String[] args) {
        JSONParser jsonparser = new JSONParser();//parse the json file
        try {
            FileReader reader = new FileReader("resources/sample6.json");
            Object obj = jsonparser.parse(reader);//Return java object that's why we need to type caste into json object
            JSONObject empJsonObj = (JSONObject) obj;
            String fname = (String) empJsonObj.get("firstname");
            String lname = (String) empJsonObj.get("lastname");
            System.out.println("FirstName: " + fname + " Last name: " + lname);

            JSONArray addressArray= (JSONArray)empJsonObj.get("address");
            for(int i=0;i<addressArray.size();i++)
            {

                JSONObject addressObj=(JSONObject)addressArray.get(i);
                System.out.println("Addresse of "+(i+1)+" is: ");
                System.out.println("_______");
                String cityOfAddress=(String)addressObj.get("city");
                Number pin=(Number)addressObj.get("pinCode");
                System.out.println("Street: "+cityOfAddress);
                System.out.println("PinCode: "+pin);
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
