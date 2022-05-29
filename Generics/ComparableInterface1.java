package Generics;

class Data7<T extends Comparable<T>> implements Comparable<T>
{
	private T myVariable;

	public Data7(T myVariable) {
		super();
		this.myVariable = myVariable; 
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data7 [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		
		
		return getMyVariable().compareTo(o) ;
	}
	
}
public class ComparableInterface1 {

	public static void main(String[] args) {
		Data7<Integer>  d=new Data7<Integer>(10);//part 1
		System.out.println(d.compareTo(20));//part 2
		// part 1 will compare with part 2
	}

}
