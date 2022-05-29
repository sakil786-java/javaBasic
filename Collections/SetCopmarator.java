package Collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Custom type comparision
class Data10<K,V>
{
	private K key;
	private V value;
	public Data10(K key, V value) {
		super();
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
		return "Data10 [key=" + key + ", value=" + value + "]";
	}
	
}


public class SetCopmarator {

	public static void main(String[] args) {
		Set<Data10> set=new LinkedHashSet<>();
		set.add(new Data10("KEY","Value"));
		set.add(new Data10(1,"One"));
		set.add(new Data10(5,"Five"));
		set.add(new Data10(9,"Nine"));
		set.add(new Data10(11,"Eleven"));
		

		for(Data10 i:set)
		{
			System.out.println(i);
		}
		
		/* If we go for tree set then we got exception because of comparable issue..java does not know how to sort this complex data
		Set<Data10> set=new TreeSet<>();
		set.add(new Data10("KEY","Value"));
		set.add(new Data10(1,"One"));
		set.add(new Data10(5,"Five"));
		set.add(new Data10(9,"Nine"));
		set.add(new Data10(11,"Eleven"));
		

		for(Data10 i:set) 
		{
			System.out.println(i);
		}*/
	}

}
