package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {

		Set<Integer> s1=new HashSet<>();
		for(int i=5;i>0;i--)
		{
			s1.add(i);
		}
		System.out.println("HashSet");
		for(int i:s1)
		{
			System.out.println(i);
		}
		
		System.out.println("_________");
		Set<Integer> s2=new LinkedHashSet<>();
		for(int i=5;i>0;i--)
		{ 
			s2.add(i);
		}
		System.out.println("Linked HashSet");
		for(int i:s2)
		{
			System.out.println(i);
		}
		
		System.out.println("_________");
		Set<Integer> s3=new TreeSet<>();
		for(int i=5;i>0;i--)
		{
			s3.add(i);
		}
		System.out.println("TreeSet");
		for(int i:s3)
		{
			System.out.println(i);
		}
		
		
	}

}
