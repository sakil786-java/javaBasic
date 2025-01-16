package Assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> l3=new LinkedList<>();
       l3.add("Sakil");
        l3.add("Afreen");
        l3.add("Muskaan");
        l3.add("Atasi");

        Collections.sort(l3);
        for(String s:l3)
        {
            System.out.println(s+" _");
            System.out.println(s+" ");
        }


    }
}
