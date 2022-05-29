package LamdaExpression;
/*
	we use lambda expression for  functional type(only one abstract method) inteface  only
 */
interface Lambda
{
	public void demo();
}

public class Lambda1 {

	public static void main(String[] args) {
		/*Lambda lambda=new Lambda() {
			@Override
			public void demo() {
				System.out.println("Statement 1");	
			}
		};
		lambda.demo();
	*/
		//Using Lambda Expression
		
		Lambda lambda=()->System.out.println("Statement 1");	
		lambda.demo();
		System.out.println();
		Lambda lambda2=(()->System.out.println("Another Proceess of express lambda expression"));
		lambda2.demo();
		System.out.println();
		Lambda lambda3=()->{
			System.out.println("For Multiple Statements..");	
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		};
		lambda3.demo();
		}
		
		
}
