package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

//find sum of all squares of even numbers an array
public class Example1 {
    public static void main(String[] args) {

        int arr[]={10,5,7,2,4};

        int sum=Arrays.stream(arr)//source

                .parallel()// parallel processing
                .filter(i->i%2==0).map(i->i*i)// intermidate operation
                .sum();//terminal operation

        System.out.println(sum);

    }
}
