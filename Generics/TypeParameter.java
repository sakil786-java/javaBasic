package Generics;

/*
 * The naming Convention 
 * T-Type 
 * E-Element
 * K-Key
 * V-Value
 * N-Number
 */
class Data4<K,V>
{
	private K key;
	private V value;
	public Data4(K key, V value) {
		
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
		return "Data4 [key=" + key + ", value=" + value + "]";
	}
	public <E,N> void Display(E element,N number)
	{
		System.out.println("Element: "+element+" Number : "+number);
	}
	
}

public class TypeParameter {

	public static void main(String[] args) {
		
		
		Data4<Integer, String> d=new Data4<Integer, String>(1,"Chaaand");
		System.out.println(d);
		System.out.println("Key: "+d.getKey()+" Value: "+d.getValue());
		
		
		d.Display("sakil", "bonani");//Anything we can pass
		d.Display("sakil", 90);
	}

}
