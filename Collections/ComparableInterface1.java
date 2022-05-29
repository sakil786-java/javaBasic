package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


class Names implements Comparable<Names>
{
	private String name;

	public Names(String name) {
	
		this.name = name;
	}

	
	@Override
	public String toString() {
		return  name ;
	}


	@Override
	public int compareTo(Names obj) {
		
		if(name.length()==obj.name.length())
		{
			return 0;
		}
		else if(name.length()<obj.name.length())
		{
			return -1;
		}
		else return 1;
	
	}	
}
public class ComparableInterface1 {

	public static void main(String[] args) {
		
			List names=new LinkedList<>();
			names.add(new Names("Chaand"));
			names.add(new Names("Ed"));
			names.add(new Names("John"));
			names.add(new Names("Mia"));
			
			ComparableInterface1 ci=new ComparableInterface1();
			ci.printList(names);
			System.out.println("After Sorting Name in Ascending Order");
			Collections.sort(names);
			ci.printList(names);
			
	}

	void printList(List<Names> list)
	{
		ListIterator<Names> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println("Element : "+it.next());
		}
		
	}

 
}