package Assignment;
//Create a program to get the number of occurrences of each word
//in a list of strings (Use concept of list and map).
import java.util.HashMap;
import java.util.Map;

public class WordOccurance {
    public static void main(String[] args) {
        String str="Sakil is a Boy Sakil is";
        String arr[]=str.split(" ");//convert string into array
        Map<String,Integer> mp=new HashMap<>();
        for(String x :arr)
        {
            if(mp.containsKey(x))// check word is present or not
            {
                mp.put(x,1+mp.get(x));// if word is present then frequency will update by +1
            }
            else
            {
                mp.put(x,1);//if not then frequency will convert 0 to 1
            }
        }
        System.out.println(mp);//print the map;
    }
}
