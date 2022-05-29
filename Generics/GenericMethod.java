package Generics;

import java.util.ArrayList;
import java.util.List;

class Data5{
	public <E> void PrintList(List<E> list)// Here E is type
	{
		for(E element: list)
		{
			System.out.println(element);
		}
	}
	
	public<E> void printArrayData(E[] arrayData)
	{
		for(E element: arrayData)
		{
			System.out.println(element);
		}
	}
}



public class GenericMethod {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(15);
		list.add(19);
		list.add(25);
		
		Data5 d=new Data5();
		System.out.println("**Printing list**");
		d.PrintList(list);
		
		
		List<String> list2=new ArrayList<>();
		
		list2.add("One ");
		list2.add("Fifteen");
		list2.add("Ninteen");
		list2.add("TwentyFive");
		System.out.println("**Printing list2**");
		d.PrintList(list2);
		System.out.println("**Printing String array**");
		String s[]= {"One","Two","Three"};
		d.printArrayData(s);
		System.out.println("**Printing integer array**");
		Integer n[]= {10,20,30};
		d.printArrayData(n);
		System.out.println("____________");
		
		
		
	}

}
