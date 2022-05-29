package StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        /*
            Terminal Operations: Terminate the pipeline of operations
            * findFirst()- find first element that matched
            * findAny()- finds any element without focusing the order of occurrence


         */


        String arr[] = {"Sakil", "sheikh", "Khan", "Ahammad", "laskar", "abcd"};
        //find the 4 digits string
        Optional<String> str1 = Stream.of(arr).filter(x -> x.length() == 4).findFirst();
        if (str1.isPresent())
            System.out.println(str1.get());
        else
            System.out.println("Not present");


        Optional<String> str2 = Stream.of(arr).filter(x -> x.length() == 4).findAny();
        System.out.println(str2.get());

        //checl all strings of 4 char length or not
        boolean b = Stream.of(arr).allMatch(x -> x.length() == 4);
        System.out.println("all match: "+b);

        boolean c = Stream.of(arr).anyMatch(x -> x.length() == 4);
        System.out.println("any match: "+c);

        boolean d = Stream.of(arr).noneMatch(x -> x.length() == 4);
        System.out.println("none match: "+d);


        //Collect: use as collector

        List<String> collectlist = Stream.of(arr).collect(Collectors.toList());
        System.out.println(collectlist);
    }
}
