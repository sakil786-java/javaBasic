package Example;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Teacher
{
    String name;
    int id;
    int doj;

    public Teacher(String name, int id, int doj) {
        this.name = name;
        this.id = id;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoj() {
        return doj;
    }

    public void setDoj(int doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", doj=" + doj +
                '}';
    }
}


public class Example1 {
    public static void main(String[] args) {

        List<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher("SBR",10,2010));
        teachers.add(new Teacher("SRSr",15,2005));
        teachers.add(new Teacher("AP",9,1999));
        Comparator<Teacher> compare_name=new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(o1.getName().length() >o2.getName().length())
                    return 1;
                else if (o1.getName().length() < o2.getName().length())
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(teachers,compare_name);
        System.out.println("Sort by name length :");
        for(Teacher a:teachers)
        {
            System.out.println(a);
        }

        Comparator<Teacher> compare_doj=new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(o1.getDoj() <o2.getDoj())
                    return -1;
                else if (o1.getDoj() >o2.getDoj())
                    return 1;
                else
                    return 0;
            }
        };
        System.out.println("Sort by Date of joining:");
        Collections.sort(teachers,compare_doj);
        for(Teacher a:teachers)
        {
            System.out.println(a);
        }
    }
}
