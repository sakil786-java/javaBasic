package StreamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation2 {
    public static void main(String[] args) {
        /*
            skip(long n)-skips the first n elements of the stream
            limit(n)- returns the stream that contains only the first n elements of the stream

         */

        String arr[]={"ARUN","is a","boy","he","works","in","a","IT","company"};
       String str= Stream.of(arr).collect(Collectors.joining(" "));
        System.out.println(str);

        //skip()
        String str2= Stream.of(arr).skip(3).collect(Collectors.joining(" "));
        System.out.println(str2);
        //limit()
        String str3= Stream.of(arr).limit(3).collect(Collectors.joining(" "));
        System.out.println(str3);

    }

}
