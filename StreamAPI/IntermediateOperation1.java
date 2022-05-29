package StreamAPI;

import java.util.Arrays;

public class IntermediateOperation1 {
    public static void main(String[] args) {
        //distinct()-returns a stream with no duplicates

        int arr[]={4,7 ,5,8,4,6,9,7};
        Arrays.stream(arr).distinct().forEach(System.out::println);

        System.out.println("Distict greater that 5");
        // remove duplicate but greater than 5
        Arrays.stream(arr).distinct().filter(i->i>5).forEach(System.out::println);

        System.out.println("Distict square of values greater than 60");
        //square of values greater than 9
        Arrays.stream(arr).distinct().map(a->a*a) .filter(i-> i>60).forEach(System.out::println);
    }

}
