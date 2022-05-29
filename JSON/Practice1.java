package JSON;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jp=new JSONParser();

        JSONArray jsonArray= (JSONArray) jp.parse(new FileReader("resources/sample5.json"));

        int i=1;
        for(Object o:jsonArray)
        {
            JSONObject person=new JSONObject();

            System.out.println("Person "+i+" details");

            long id=(long)person.get("id");
            System.out.println("id: "+id);

            String name=(String)person.get("name");
            System.out.println("name: "+name);

            JSONArray tagsArray=new JSONArray();
            int j=1;
            for(Object p: tagsArray)
            {
                System.out.println("tag name "+j+" : "+p);
                j++;
            }

        }

    }
}
