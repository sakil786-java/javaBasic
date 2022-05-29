package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	static ArrayList<String> listnames=new ArrayList<>();//static because access from Main
	 void displayName(ArrayList<String> list)
	{
		for(String name: list)
		{
			System.out.println(name);
		}
	}
	
	 void removeByPosition(int index) {
		listnames.remove(index);
	}
	 void removeByNames(String name) {
		listnames.remove(name);
	}
	 void modifyName(int index,String newName)
	 {
		 listnames.set(index, newName);
	 }
	 
	 int searchName(String name)
	 {
		 return listnames.indexOf(name);
	 }
	 
	 
	public static void main(String[] args) {
		
		
		listnames.add("Sakil");
		listnames.add("Chand");
		listnames.add("Sohail");
		listnames.add("Kushal");
		listnames.add("Jadu");
		listnames.add("Bilas");
		listnames.add("Soumya");
		System.out.println(listnames.get(3));
		System.out.println("*********");
		ArrayList1 a1=new ArrayList1();
		a1.displayName(listnames);
		System.out.println("*********");
		a1.removeByNames("Sakil");
		a1.displayName(listnames);
		System.out.println("*********");
		a1.removeByPosition(3);
		a1.displayName(listnames);
		System.out.println("*********");
		a1.modifyName(2, "John");
		a1.displayName(listnames);
		System.out.println("*********");
		int position=a1.searchName("Sohail");
		if(position!=-1)
		{
			a1.modifyName(position, "Shamim");
		}
		else
		{
			System.out.println("Wrong Entry");
		}
		System.out.println("*********");
		a1.displayName(listnames);
	}

}
