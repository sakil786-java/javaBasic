package Enumerations;

public class Demo {

	public static void main(String[] args) {
		Learning learn=Learning.COREJAVA;//object of enumurated type
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Collection learn");
			break;
		case COREJAVA:
			System.out.println("COREJAVA learn");
			break;
		case GENERICS:
			System.out.println("GENERICS learn");
			break;
		case JSPANDSERVLETS:
			System.out.println("JSPANDSERVLETS learn");
			break;
		case MULTITHREADING:
			System.out.println("MULTITHREADING learn");
			break;
		default:
			System.out.println("Default");
			break;
		
		}

	}

}
