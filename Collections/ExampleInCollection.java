package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleInCollection {

	public static void main(String[] args) {
	
		List<String>al=new ArrayList<String>();
		al.add("Blue");
		al.add("Green");
		al.add("White");
		al.add("Yellow");
		for(String c:al)
		{
			
			System.out.println(c);
		}
		System.out.println("******");
		al.add(0,"pink");
		for(String c:al)
		{
			
			System.out.println(c);
		}
		System.out.println("******");
		System.out.println(al.get(4));
		System.out.println("******");
		al.set(2, "Red");
		for(String c:al)
		{
			
			System.out.println(c);
		}
		System.out.println(al.contains("pink"));
		
		Collections.sort(al);
		System.out.println("*******");
		for(String c:al)
		{
			
			System.out.println(c);
		}
		
		List<String>al2=new ArrayList<String>();
		al2.add("saki");
		al2.add("sadik");
		al2.add("sameha");
	Collections.copy(al, al2);
	System.out.println("*******");
	for(String c:al)
	{
		
		System.out.println(c);
	}
	Collections.shuffle(al);
	System.out.println("*******");
	for(String c:al)
	{
		
		System.out.println(c);
	}
	System.out.println("*******");
	al2.add("Red");
	al2.add("Yellow");
	System.out.println("List Compare");
	List<String>al3=new ArrayList<String>();
	for(String e:al)
	{
		al3.add(al2.contains(e)? "Yes" :"NO");
		
	}
	System.out.println(al3);
	
	
	}

}
