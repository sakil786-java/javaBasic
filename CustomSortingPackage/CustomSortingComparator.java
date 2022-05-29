package CustomSortingPackage;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Bike<price,name>
{
    private price rupees;
    private name model;

    public Bike(price rupees, name model) {
        this.rupees = rupees;
        this.model = model;
    }

    public price getRupees() {
        return rupees;
    }
    public name getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "rupees=" + rupees +
                ", model=" + model +
                '}';
    }
}




public class CustomSortingComparator {
    public static void main(String[] args) {
        Comparator<Bike<Integer,String>> comapre_price=new Comparator<Bike<Integer, String>>() {
            @Override
            public int compare(Bike<Integer, String> o1, Bike<Integer, String> o2) {
                if(o1.getRupees()>o2.getRupees())
                    return 1;
                else if(o1.getRupees()<o2.getRupees())
                    return -1;
                else
                return 0;
            }
        };
        Comparator<Bike<Integer,String>> comapre_brand=new Comparator<Bike<Integer, String>>() {
            @Override
            public int compare(Bike<Integer, String> o1, Bike<Integer, String> o2) {
                if(o1.getModel().length()<o2.getModel().length())
                    return 1;
                else if(o1.getModel().length()>o2.getModel().length())
                    return -1;
                else
                    return 0;
            }
        };
        Set<Bike<Integer,String>> s1=new TreeSet<>(comapre_price);
        s1.add(new Bike(10,"TVS"));
        s1.add(new Bike(15,"Bajaj"));
        s1.add(new Bike(7,"HERO"));
        s1.add(new Bike(17,"Yamaha"));
        System.out.println("Based on price: ");
        for(Bike i:s1)
        {
            System.out.println(i);
        }

        System.out.println("_____");
        Set<Bike<Integer,String>> s2=new TreeSet<>(comapre_brand);
        s2.add(new Bike(10,"TVS"));
        s2.add(new Bike(15,"Bajaj"));
        s2.add(new Bike(7,"HERO"));
        s2.add(new Bike(17,"Yamaha"));
        System.out.println("Based on Model: ");
        for(Bike i:s2)
        {
            System.out.println(i);
        }

    }
}
