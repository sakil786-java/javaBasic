package LamdaExpression;
//predicate returns  boolean value true or false

import java.util.function.IntPredicate;

public class Predicate1 {

	public static void main(String[] args) {
		
		/*
		 IntPredicate lessThan18=new IntPredicate()
		 
				{

					@Override
					public boolean test(int value) {
						if(value<18)
							return true;
						else
						return false;
					}
			
				};
				System.out.println(lessThan18.test(25));
				System.out.println(lessThan18.test(17));
				*/
		
		// Using Lambda Expression
		IntPredicate lessThan18=i->i<18;// means i is less than 18;
		IntPredicate moreThan10=i->i>10;
		System.out.println(lessThan18.test(17));
		System.out.println(moreThan10.test(17));
		System.out.println(lessThan18.and(moreThan10).test(25));
		System.out.println(lessThan18.or(moreThan10).test(13));
		
		
	}

}
