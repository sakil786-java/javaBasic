package StreamAPI;

import java.util.Arrays;
import java.util.Optional;

public class PeekOperation {
    public static void main(String[] args) {
      /*  peek(Consumer)- Returns the output stream that is identical to the input stream
        Each element is passed to the accept() method of the consumer

        peek is use for debuging example in here we use peek after each operation
       */
        //find the length of max length string in array

        String arr[]={"Sakil","Ahammad","laskar"};
        Optional<Integer> max = Arrays.stream(arr)
                .peek(x-> System.out.println(x))
                .map(x -> x.length())
                .peek(x-> System.out.println(x))
                .max((x, y) -> x - y);

        if(max.isPresent())
        {
            System.out.println("Max value is "+max.get());
        }


        System.out.println("______________");



    }
}
