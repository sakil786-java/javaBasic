
package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Custom type comparision
class Data11<K,V>
{
	private K key;
	private V value;
	public Data11(K key, V value) {
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
		return "Data11 [key=" + key + ", value=" + value + "]";
	}
	
}


public class TreesSetComparator {

	public static void main(String[] args) {
		
		// If we go for treeset then we got exception because of comparable issue..java does not know how to sort this complex data
		
		Comparator <Data11<Integer,String>> COMPARE_KEY=new Comparator <Data11<Integer,String>>()
		{

			@Override
			public int compare(Data11<Integer, String> obj1, Data11<Integer, String> obj2) {
				if(obj1.getKey()<obj2.getKey())
				{
					return -1;
				}
				else if(obj1.getKey()> obj2.getKey())
					return 1;
				else
				return 0;
			}
			
		};
		Set<Data11<Integer,String>> set=new TreeSet<>(COMPARE_KEY);//sorting based one key
		
		set.add(new Data11<Integer,String>(1,"One"));
		set.add(new Data11<Integer,String>(5,"Five"));
		set.add(new Data11<Integer,String>(91,"Ninety One"));
		set.add(new Data11<Integer,String>(11,"Eleven"));
		System.out.println("SORT Based on Key :");

		for(Data11<Integer,String> i:set)
		{
			System.out.println(i);
		}
		
		
		
		
		Comparator <Data11<Integer,String>> COMPARE_LENGTH=new Comparator <Data11<Integer,String>>()
		{

			@Override
			public int compare(Data11<Integer, String> obj1, Data11<Integer, String> obj2) {
				if(obj1.getValue().length() <obj2.getValue().length())
				{
					return -1;
				}
				else if(obj1.getValue().length() >obj2.getValue().length())
					return 1;
				else
				return 0;
			}
			
		};
		System.out.println();
Set<Data11<Integer,String>> set2=new TreeSet<>(COMPARE_LENGTH);//sorting based one key
	
		set2.add(new Data11<Integer,String>(1,"ab"));
		set2.add(new Data11<Integer,String>(6,"cdefgi"));
		set2.add(new Data11<Integer,String>(5,"cdefgh"));
		set2.add(new Data11<Integer,String>(91,"fghakjflgb")); 
		set2.add(new Data11<Integer,String>(11,"z"));
		
		System.out.println("SORT Based on Value length:");

		for(Data11<Integer,String> i:set2)
		{
			System.out.println(i);
		}
		
		
		
	}

}
