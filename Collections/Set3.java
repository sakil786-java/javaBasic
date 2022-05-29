package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		Set<String> s1=new HashSet<>();
		s1.add("Cat");
		s1.add("Boy");
		s1.add("Tiger");
		s1.add("Mouse");
		s1.add("Dog");
		System.out.println(s1);
		Set<String> s2=new HashSet<>();
		s2.add("Cat");
		s2.add("Elephant");
		s2.add("Tiger");
		s2.add("Camel");
		s2.add("Lion");
		System.out.println(s2);
		Set<String> intersection =new HashSet<>(s1);

		System.out.println("_______");

		intersection.retainAll(s2);
		System.out.println(intersection);
		
		Set<String> difference =new HashSet<>(s1);
		difference.removeAll(s2);
		System.out.println(difference);
		

	}

}
