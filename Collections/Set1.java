package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
	
		Set<String> s1=new HashSet<>();
		s1.add("Mia");
		s1.add("Chand");
		s1.add("Sakil");
		s1.add("Mia");
		s1.add("Chand");
		
		for(String e:s1)
		{
			System.out.println(e); 
		}
		System.out.println(s1.contains("Chand"));
		System.out.println(s1.contains("Shouvik"));
	}

}
