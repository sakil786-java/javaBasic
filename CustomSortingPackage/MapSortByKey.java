package CustomSortingPackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByKey {
    static Map<Integer,String> hashMap=new HashMap<>();

     static void sortByKeyAscending()
    {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.putAll(hashMap);

        for(Map.Entry<Integer,String> entry:treeMap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
    static void sortByKeyDescending()
    {
        TreeMap<Integer,String> treeMap=new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(hashMap);

        for(Map.Entry<Integer,String> entry:treeMap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        hashMap.put(10,"Ten");
        hashMap.put(13,"Thirteen");
        hashMap.put(9,"Nine");
        hashMap.put(1,"One");
        hashMap.put(7,"Seven");
        System.out.println("Sort by key in ascending order");
        sortByKeyAscending();
        System.out.println("Sort by key in descending order");
        sortByKeyDescending();
    }

}
