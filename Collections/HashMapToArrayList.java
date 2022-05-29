package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		Map<Integer,String> m1=new LinkedHashMap<>();
		m1.put(10,"Sakil");
		m1.put(5,"Sam");
		m1.put(45,"John");
		m1.put(9,"Rahul");
		m1.put(8,"Atasi");
		
		ArrayList<Integer> listOfKeys=new ArrayList<>(m1.keySet());
		System.out.println(listOfKeys);
		ArrayList<String> listOfValues=new ArrayList<>(m1.values());
		System.out.println(listOfValues);

	}

}
