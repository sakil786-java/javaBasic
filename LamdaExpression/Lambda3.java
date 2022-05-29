package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data
{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}
public class Lambda3 {

	public static void main(String[] args) {
		
		List<Data> l1=new ArrayList<>();
		l1.add(new Data("Chaand"));
		l1.add(new Data("ED"));
		l1.add(new Data("Angelica"));
		l1.add(new Data("Maqbul"));
		l1.add(new Data("John"));
		/*
		 Collections.sort(l1,new Comparator<Data>()
		{

			@Override
			public int compare(Data o1, Data o2) {
				return o1.getName().compareTo(o2.getName());
				
			}
			
		});
		*/
		
		// By using Lamabda Expression Sort
		
		//Collections.sort(l1,(Data o1, Data o2)->o1.getName().compareTo(o2.getName()));
		//OR 
		// Sorting Based on Name
		Collections.sort(l1,(Data o1, Data o2)->
		{
		return 	o1.getName().compareTo(o2.getName());
			
		});
		//Sorting Based on Name Length
		Collections.sort(l1,(Data o1, Data o2)->
		{
		if(o1.getName().length()< o2.getName().length()) {
			return -1;
		}
				
		else if(o1.getName().length() > o2.getName().length()){
			return 1;	
		}
		else
			return 0;
			
		});
		
		for(Data d:l1)
		{
			System.out.println(d.getName());
		}
		

	}

}
