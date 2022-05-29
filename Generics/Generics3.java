package Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data3<T>
{
	private T myVariable;

	public Data3(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

	
	
}


public class Generics3 {

	public static void main(String[] args) {
		
		List<Data3<Object>> l1=new LinkedList<>();
		l1.add(new Data3<Object>("Some Object"));
		l1.add(new Data3<Object>(20));
		l1.add(new Data3<Object>(25.89));
		l1.add(new Data3<Object>(19.4f));
		
		Generics3 g3=new Generics3();
		g3.printList(l1);
	}
	void printList(List<Data3<Object>> list)
	{
		ListIterator<Data3<Object>> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println("Element : "+it.next().getMyVariable());
		}
		
	}
}
