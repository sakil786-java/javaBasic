package LamdaExpression;

import java.util.function.IntPredicate;

public class Predicate2 {
	public static void main(String[] args) {
		
		IntPredicate lessThan18=i->i<18;// means i is less than 18;
		IntPredicate moreThan10=i->i>10;
		Predicate2 p=new Predicate2();
		p.demo(15, lessThan18, moreThan10);
		p.demo(9, lessThan18, moreThan10);
		
	}
	
	public void demo(int x,IntPredicate lessThan18,IntPredicate moreThan10)
	{
		if(lessThan18.and(moreThan10).test(x))
		{
			System.out.println("The input is less than 18 and more than 10 ");
		}
		else
		{
			System.out.println("Invalid input ");
		}
	}

}
