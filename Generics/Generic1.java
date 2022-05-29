package Generics;
//class based on property of object type
class Data{
	private Object obj;
	
	
	public Data(Object obj) {
		this.obj = obj;
	}


	public Object getObj() {
		return obj;
	}
 

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
}
public class Generic1 {

	public static void main(String[] args) {
		
			Data data=new Data("Some String");
			String variable=(String)data.getObj();
			System.out.println(variable);
	}

}
