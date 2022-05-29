package Generics;

class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "genericClass [data=" + data + "]";
	}

	
	
}


public class Generic2 {

	public static void main(String[] args) {
		GenericClass<String> gc=new GenericClass<String>("Some data");
		String data=gc.getData();
		System.out.println(data);
		
		GenericClass<Integer> gc1=new GenericClass<Integer>(15);
		int data1=gc1.getData();
		System.out.println(data1);

	}

}
