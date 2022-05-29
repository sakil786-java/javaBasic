package Collections;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names1
{
	private String name;

	public Names1(String name) {
	
		this.name = name;
	}

	
	@Override
	public String toString() {
		return  name ;
	}


	
}
public class ComparableInterface2 {

	public static void main(String[] args) {
		
			List<Object> elements=new LinkedList<>();
			elements.add(new Names1("Chaand"));
			elements.add(new Names1("Ed"));
			elements.add(new Names1("John"));
			elements.add(new Names1("Mia"));
			elements.add("A");
			elements.add(10);
			elements.add("%");
			elements.add(20);
			ComparableInterface2 ci=new ComparableInterface2();
			ci.printList(elements);
			
			// Data are different Collections.sort(elements);
			//ci.printList(elements);
			 
	}

	void printList(List<Object> list)
	{
		ListIterator<Object> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println("Element : "+it.next());
		}
		
	}

 
}