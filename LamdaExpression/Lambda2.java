package LamdaExpression;



public class Lambda2 {

	public static void main(String[] args) {
		
		/*Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Thread 1");	
			}
		});
		t1.start();*/
		
		Thread t1=new Thread( ()->System.out.println("Inside Thread 1 by lambda") );
		t1.start();
		
		Thread t2=new Thread(  ()->{
			System.out.println("For Multiple Statements");
			System.out.println("statement 2");
		
		});
		t2.start();
	}
		

}
