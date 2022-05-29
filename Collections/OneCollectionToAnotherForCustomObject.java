package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override 
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name o) {
		
		return getName().compareTo(o.getName());
	}
	
}
public class OneCollectionToAnotherForCustomObject {

	public static void main(String[] args) {
		Set<Name> s=new HashSet<>();
		s.add(new Name("Chaand"));
		s.add(new Name("John"));
		s.add(new Name("Mia"));
		s.add(new Name("Sakil"));
		s.add(new Name("Chaand"));
		s.add(new Name("Arman"));
		
		List<Name> l1=new ArrayList<>();
		l1.addAll(s);
		Collections.sort(l1);
		for(Name name:l1)
		{
			System.out.println(name);
		}
		
		System.out.println(Collections.binarySearch(l1, new Name("Arman")));
		System.out.println(Collections.binarySearch(l1, new Name("SRK")));

	}

}
