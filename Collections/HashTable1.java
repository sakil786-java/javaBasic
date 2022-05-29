package Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> h1=new Hashtable<>();
		h1.put(10, "Sakil");
		h1.put(9, "Xyz");
		h1.put(5, "Abc");
		h1.put(15, "PQr");
		System.out.println(h1.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h1);
		
		Map<Integer,String> m1=new LinkedHashMap<>();
		m1.put(10,"Sakil");
		m1.put(5,"Sam");
		m1.put(45,"John");
		m1.put(9,"Rahul");
		m1.put(8,"Atasi");
		System.out.println(m1.keySet());
		
		
		List list=new ArrayList(m1.keySet());
		System.out.println(list);
		
		List listValues=new ArrayList(m1.values());
		System.out.println(listValues);

	}

}
