package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneCollectionToAnother {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Chaand");
		s.add("John");
		s.add("Mia");
		s.add("Sakil");
		s.add("Chaand");
		s.add("Arman");
		
		List<String> l1=new ArrayList<>();
		l1.addAll(s);
		Collections.sort(l1);
		for(String name:l1)
		{
			System.out.println(name);
		}
		System.out.println(Collections.binarySearch(l1, "Sakil"));
		System.out.println(Collections.binarySearch(l1, "SRK"));

	}

}
