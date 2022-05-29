package StreamAPI;


import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {

        Stream<String> stream1=Stream.of("a","b","c","d");
        Stream<String> stream2=Stream.of("e","f","g","h");
        //concat for streams
        Stream.concat(stream1,stream2).forEach(i-> System.out.print(i+" "));
        System.out.println();
        //range-used for ranging the value rangeClosed used for last value include
        IntStream.range(10,15).forEach(System.out::print);
        System.out.println();
        IntStream.rangeClosed(10,15).forEach(System.out::print);

        //Infinite stream
        Stream.generate(()->myGenerator()).forEach(System.out::println);

    }
    static int myGenerator()
    {
        return new Random().nextInt();
    }
}
