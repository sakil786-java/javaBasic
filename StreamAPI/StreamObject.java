package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream API- collection process
        //Collection /group of object we can use in array

        // Stream is an Interface but create the stream 5 process
        //1. blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(i -> {
            System.out.println(i);
        });
        //2. Array,object , collection
        String names[] = {"Sakil", "Triparna", "Shubhajit", "Palash"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(i -> {
            System.out.println(i);
        });

        // 3-builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();


        //4.pass array
        IntStream streamArray1 = Arrays.stream(new int[]{10, 50, 40});
        streamArray1.forEach(i -> {
            System.out.println(i);
        });

        System.out.println("__________");
        DoubleStream streamArray2 = Arrays.stream(new double[]{14.5, 16.7, 19});
        streamArray2.forEach(i -> {
            System.out.println(i);
        });

        System.out.println("__________");
        // by using list, set
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(45);
        list1.add(14);
        list1.add(35);
        list1.add(78);
        Stream<Integer> streamList = list1.stream();
        streamList.forEach(i -> {
            System.out.println(i);
        });



    }
}
