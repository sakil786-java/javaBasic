package LamdaExpression;

import java.util.ArrayList;
import java.util.List;

class Data10
{
	private String name;

	public Data10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data10 [name=" + name + "]";
	}

	
	
}
public class Lambda5 {

	public static void main(String[] args) {
		List<Data10> list=new ArrayList<>();
		list.add(new Data10("Chaand"));
		list.add(new Data10("John"));
		list.add(new Data10("Mia"));
		list.add(new Data10("Angelica"));
		list.add(new Data10("Roy"));
		
		list.forEach(temp->{
			System.out.println(temp.getName());
		});

	}

}
