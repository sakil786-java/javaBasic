package Generics;

class Data6<K extends Integer,V extends BoundedTypeParameter>
{
	private K key;
	private V value;
	public Data6(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value; 
	}
	@Override
	public String toString() {
		return "Data6 [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Character,N extends Number> void Display(E element,N number)
	{
		System.out.println("Element : "+element+" Number : "+number);
	}
	/*
	 * /N in Number is a class java.util package and we restrict here only number inpiut is valid,,
	 * like float int double any type of just number
	 * Same as E as Character;
	 */
}

public class BoundedTypeParameter {

	public static void main(String[] args) {
		//Data6<Integer,String> d=new Data6<Integer,String>(10,"Hi");
		Data6<Integer,BoundedTypeParameter> d=new Data6<Integer,BoundedTypeParameter>(10,new BoundedTypeParameter());
		// Inside of object d has and object of BoundedTypeParameter type..object BoundedTypeParameter  calling test method.
		
		d.Display('s', 20);
		d.getValue().Test();
		System.out.println(d.getKey());
	}
	public void Test()
	{
		System.out.println("Testing ..");
	}

}
