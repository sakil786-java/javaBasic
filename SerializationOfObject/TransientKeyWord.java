package SerializationOfObject;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyWord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i=10,j=20;
	transient int  k=30;
	transient static int l=40;//no effect
	transient final int m=50;//no effect
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		TransientKeyWord t=new TransientKeyWord();
		//serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new 	ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.close();		
		//de-serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new 	ObjectInputStream(fis);
		TransientKeyWord o=(TransientKeyWord)ois.readObject();
		System.out.println("i "+o.i);
		System.out.println("j "+o.j);
		System.out.println("k "+o.k);
		System.out.println("l "+l);
		System.out.println("m "+o.m);
		ois.close();
		
		
		
		}

}
