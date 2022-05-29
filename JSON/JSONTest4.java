package JSON;

import org.json.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONTest4 {
    public static void main(String[] args) {

        JSONObject jo=new JSONObject();
        jo.put("firstname","john");
        jo.put("lastname","smith");
        jo.put("age",26);

        JSONObject jaddress=new JSONObject();
        jaddress.put("city","Howrah");
        jaddress.put("pinCode",711317);

        jo.put("address",jaddress);

        JSONArray phoneArray=new JSONArray();
        JSONObject phonenum1=new JSONObject();
        phonenum1.put("type","Mobile");
        phonenum1.put("number",70032775);

        JSONObject phonenum2=new JSONObject();
        phonenum2.put("type","LandLine");
        phonenum2.put("number",56542544);
        phoneArray.put(phonenum1);
        phoneArray.put(phonenum2);

        jo.put("phoneNumbers",phoneArray);

        try(FileWriter fw=new FileWriter("resources/output4.json"))
        {
            fw.write(jo.toJSONString());


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jo);
    }
}
