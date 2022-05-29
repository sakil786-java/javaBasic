package CustomSortingPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    private String name;
    private int roll;
    private String dscipline;

    public Student(String name, int roll, String dscipline) {
        this.name = name;
        this.roll = roll;
        this.dscipline = dscipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getDscipline() {
        return dscipline;
    }

    public void setDscipline(String dscipline) {
        this.dscipline = dscipline;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", dscipline=" + dscipline +
                '}';
    }

    @Override
    /*
    public int compareTo(Student o) {
        if(o.getName().length() >this.getName().length())
            return 1;
        else if(o.getName().length()<this.getName().length())
            return -1;
        else
        return 0;
    }*/
    /*
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
    }*/
    public int compareTo(Student o)
    {
        if(o.getName().length() >this.getName().length())
            return -1;
        else if(o.getName().length()<this.getName().length())
            return 1;
        else
            return 0;
    }

}

public class CustomSorting {
    public static void main(String[] args) {
        List<Student> l1=new ArrayList<>();
        l1.add(new Student("SAKIL",90,"CSE"));
        l1.add(new Student("Triparna",5,"ME"));
        l1.add(new Student("Palash",19,"CSE"));
        l1.add(new Student("Shibasish",25,"MCA"));
        l1.add(new Student("Avik",9,"EE"));
        System.out.println("Before sort :");
       for(Student s:l1)
       {
           System.out.println(s);

       }
       // Collections.sort(l1);
       Collections.sort(l1,Collections.reverseOrder());
        System.out.println("After sort :");
        for(Student s:l1)
        {
            System.out.println(s);

        }

    }
}
