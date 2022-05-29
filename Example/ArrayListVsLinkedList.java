package Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        List<Integer> arraylist=new ArrayList<>();
        List<Integer> linkedlist=new LinkedList<>();
        System.out.println("Adding Item End of List");
        doTimingsForAddInEnd("ArrayList",arraylist);
        doTimingsForAddInEnd("LinkedList",linkedlist);

        System.out.println("_____________________");
        System.out.println("Adding Item First of List");
        doTimingsForAddInFirst("ArrayList",arraylist);
        doTimingsForAddInFirst("LinkedList",linkedlist);

    }


    private static void doTimingsForAddInEnd(String type, List<Integer> list) {

        for(int i=0;i<1E5;i++)
        {
            list.add(i);
        }
        long startTime=System.currentTimeMillis();
        //add element end of the list
        for(int i=0;i<1E5;i++)
        {
            list.add(i);
        }
        long endtTime=System.currentTimeMillis();

        System.out.println("Totaltime:"+(endtTime-startTime)+"ms  type: "+type);
    }

    private static void doTimingsForAddInFirst(String type, List<Integer> list) {


        long startTime=System.currentTimeMillis();
        //add element end of the list
        for(int i=0;i<1E5;i++)
        {
            list.add(0,i);
        }
        long endtTime=System.currentTimeMillis();

        System.out.println("Totaltime:"+(endtTime-startTime)+"ms  type: "+type);
    }
}
