package WildCard_In_Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {

		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}

}

class Car extends Vehicle
{
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

}
public class WildCards {

	public static void main(String[] args) {
		/*
		 List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(13,"Maruti"));
		display(list);
	
		List<Object> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(13,"Maruti"));
		list.add(new String(" String Object"));
		display(list);
		
		
		*/

		List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(13,"Maruti"));

		UpperBoundDisplay(list);
		System.out.println("_______");
		LowerBoundDisplay(list);
	}
	public static void display(List<?> list)// we dont know the object  type thats why question mark
	{
		for(Object element:list)
		{
			System.out.println(element);
		}
	}
	public static void UpperBoundDisplay(List<? extends Vehicle> list)// It will print Vehicle and his Child class it is called upper Bound
	{
		for(Vehicle element:list)
		{
			System.out.println(element);
		}
	}

	public static void LowerBoundDisplay(List<? super Car> list)// It will print Car and his Parent class it is called Lower Bound
	{
		for(Object element:list)
		{
			System.out.println(element);
		}
	}

}
