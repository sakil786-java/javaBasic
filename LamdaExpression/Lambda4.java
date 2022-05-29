package LamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {

	public static void main(String[] args) {
		/*int x=10;
		new Thread( ()->System.out.println("The value of x: "+x) ).start();

*/
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(5);
		l1.add(50);
		l1.add(90);
		l1.add(6);
		
		/*
		 for(Integer i:l1)
		{
			if(i>10)
				System.out.println(i);
		}
		*/
		//using Lambda Expression For each loop
		//l1.forEach(i->System.out.println(i));
		
		l1.forEach(i->{
			if(i>=10)
			{
				System.out.println(i);
			}
		});
	}

}
