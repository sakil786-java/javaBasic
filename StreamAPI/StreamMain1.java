package StreamAPI;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        //create a list and filter all evens number

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(45);
        list1.add(14);
        list1.add(35);
        list1.add(78);

        //another technique create list by using "of" but it is immutable in nature


        //without Stream
        List<Integer> listeven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0)
                listeven.add(i);
        }
        System.out.println(list1);
        System.out.println("_____________");
        System.out.println(listeven);

        // .stream() use for get the object of a collections
        //Using  Stream API
        Stream<Integer> streamList = list1.stream();
        List<Integer> newEvenList = streamList.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newEvenList);

        // above code in single line
        List<Integer> listInOneLine = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(listInOneLine);
        System.out.println("_____________");

        //print that number that are greater than 30

        List<Integer> listOfGreaterThan30 = list1.stream().filter(i -> i >= 30).collect(Collectors.toList());
        System.out.println(listOfGreaterThan30);


    }

}
