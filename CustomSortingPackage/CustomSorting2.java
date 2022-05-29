package CustomSortingPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Community
{
     String name;
     int roll;

    public Community(String name, int roll) {
        this.name = name;
        this.roll = roll;
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

    @Override
    public String toString() {

        return "Community{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
class SortByName_Community implements Comparator<Community>
{

    @Override
    public int compare(Community o1, Community o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SortByRoll_Community implements Comparator<Community>
{

    @Override
    public int compare(Community o1, Community o2) {
        return o1.roll-o2.roll;
    }
}

public class CustomSorting2 {
    public static void main(String[] args) {

        List<Community> l2=new ArrayList<>();
        l2.add(new Community("SAKIL",90));
        l2.add(new Community("Triparna",5));
        l2.add(new Community("Palash",19));
        l2.add(new Community("Shibasish",25));
        l2.add(new Community("Avik",9));
        System.out.println("Before sort :");
        for(Community s:l2)
        {
            System.out.println(s);

        }


        Collections.sort(l2,new SortByName_Community() );

        System.out.println("After  sort by Name :");
        for(Community s:l2)
        {
            System.out.println(s);

        }


        Collections.sort(l2,new SortByRoll_Community() );
        System.out.println("After  sort by Roll :");
        for(Community s:l2)
        {
            System.out.println(s);

        }

    }
}
