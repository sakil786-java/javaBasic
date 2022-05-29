package Collections;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(50);
		s.push(90);
		s.push(48);
		s.push(35);
		s.push(42);
		System.out.println(s);
		if(s.isEmpty())
		{
			System.out.println("List Empty");
		}
		else
			System.out.println("Not Empty");
		
		System.out.println(s.search(90));
		System.out.println(s.search(8));
	}

}
