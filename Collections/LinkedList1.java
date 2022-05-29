package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> l1=new LinkedList<>();
		l1.add("INDIA");
		l1.add("AUS");
		l1.add("GERMANY");
		l1.add("USA");
		l1.add("DUBAI");
		System.out.println(l1);
		System.out.println("***********");
		
		new LinkedList1().printList(l1);
		l1.sort(null);
		System.out.println("***********");
		System.out.println("Sorted List  ");
		new LinkedList1().printList(l1);
		
		Collections.reverse(l1);
		System.out.println("***********");
		System.out.println("Reverse List  ");
		new LinkedList1().printList(l1);
		System.out.println("***********");
		
		new LinkedList1().printListIterator(l1);
		
	}
	void printList(List<String> list)
	{
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("Element : "+it.next());
		}
		
	}
	

	void printListIterator(List<String> list)
	{
		System.out.println("List Reverse");
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious())
		{

			System.out.println("Element : "+it.previous());
		}
		
	}
}
