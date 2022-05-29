package SerializationOfObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike=new Vehicle("Bike",5468);
		Vehicle car=new Vehicle("Car",4785);
		
		
		try(FileOutputStream fos=new FileOutputStream("vehicles.dat")){//.dat stands for data file
			try(ObjectOutputStream obj=new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object Written On to the file");
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}

	}

}
