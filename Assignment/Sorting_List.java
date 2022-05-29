package Assignment;
//Sort an unsorted list, both in increasing and decreasing order
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List {

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(12);
        l1.add(5);
        l1.add(9);
        l1.add(45);

        System.out.println("Unsorted List: ");
        for(Integer i:l1)
        {
            System.out.println(i);
        }

        System.out.println(" List in Increasing Order: ");
        Collections.sort(l1);
        for(Integer i:l1)
        {
            System.out.println(i);
        }
        System.out.println(" List in Decreasing Order: ");
        Collections.sort(l1,Collections.reverseOrder());
        for(Integer i:l1)
        {
            System.out.println(i);
        }


    }
}
