package JSON;

import com.mysql.cj.xdevapi.JsonArray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

public class JSONTest1 {
    public static void main(String[] args) {
        JSONObject root=new JSONObject();
        JSONObject instance=new JSONObject();
        JSONObject schema3=new JSONObject();

        JSONArray table1=new JSONArray();
        JSONArray table2=new JSONArray();

        try{
            root.put("Instances",instance);

            instance.put("Schema-1", Collections.emptyMap());
            instance.put("Schema-2", Collections.emptyMap());
            instance.put("Schema-3",schema3);

            schema3.put("Table-1",table1);
            schema3.put("Table-2",table2);

            table1.put("Column-1");
            table1.put("Column-2");
            table1.put("Column-3");

            table2.put("Column-4");
            table2.put("Column-5");
            table2.put("Column-6");


        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }

        System.out.println(root);

        String fileName="resources/output1.json";
        try(FileWriter fw=new FileWriter(fileName))
        {
            fw.write(root.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
