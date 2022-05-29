package JSON;
//Write on JSON file
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class JSONTest2 {
    public static void main(String[] args) {
        JSONObject employeeDetails1=new JSONObject();
        employeeDetails1.put("firstName","Lokesh");
        employeeDetails1.put("lastName","Gupta");
        employeeDetails1.put("website","howtodoinjava.com");

        JSONObject employeeObject1=new JSONObject();
        employeeObject1.put("employee",employeeDetails1);

        JSONObject employeeDetails2=new JSONObject();
        employeeDetails2.put("firstName","Brian");
        employeeDetails2.put("lastName","Schultz");
        employeeDetails2.put("website","example.com");

        JSONObject employeeObject2=new JSONObject();
        employeeObject2.put("employee",employeeDetails2);

        // add employee to list
        JSONArray employeeList=new JSONArray();
        employeeList.add(employeeObject1);
        employeeList.add(employeeObject2);

        //Write on json file

        try(FileWriter fw=new FileWriter("resources/output2.json"))
        {
            fw.write(employeeList.toJSONString());
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(employeeList);

    }
}
