package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONTest5 {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jParser = new JSONParser();
        JSONArray a = (JSONArray) jParser.parse(new FileReader("resources/sample5.json"));
        int i=1;
        for(Object o:a)
        {
            JSONObject person=(JSONObject) o;
            System.out.println("Person "+i+" Details: ");

            long Id=(long)person.get("id");
            System.out.println("Id: "+Id);

            String name=(String)person.get("name");
            System.out.println("Name : "+name);

            boolean isActive=(boolean)person.get("isActive");
            System.out.println("Status is Active :"+isActive);

            JSONArray tagArray=(JSONArray)person.get("tags");
            int j=1;
            for(Object p:tagArray)
            {
                System.out.println("tag name "+j+" : "+p);
                j++;
            }
            System.out.println();
            JSONArray friendsArray=(JSONArray)person.get("friends");
            int k=1;
            for(Object q:friendsArray)
            {
                JSONObject friends=(JSONObject)q;
                System.out.println("friends "+k+" details: ");
                long frindsId=(long) friends.get("id");
                String friendsName=(String)friends.get("name");
                System.out.println("frindsId: "+frindsId+" "+"friendsName:"+friendsName);

                k++;
            }
            String favFood=(String)person.get("favoriteFood");
            System.out.println("Favorite Food: "+favFood);

            i++;
            System.out.println("________________");

        }
    }
}
