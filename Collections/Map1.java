package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(10,"Sakil");
		m1.put(5,"Sam");
		m1.put(45,"John");
		m1.put(9,"Rahul");
		m1.put(8,"Atasi");
		
		System.out.println("Using For Each LOOP: ");
		for(Entry<Integer, String> e:m1.entrySet())
		{
			System.out.println("Key :"+e.getKey()+" Value : "+e.getValue());
		}

		
		System.out.println("Using Iterator: ");
		
		Iterator<Entry<Integer,String>> e=m1.entrySet().iterator();
		
		while(e.hasNext())
		{
			Entry<Integer,String> temp=e.next();
			System.out.println("Key: "+temp.getKey()+" Value: "+temp.getValue());
		}



		for(Map.Entry<Integer,String> entry:m1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
