package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapVsFlatMap {

    public static void main(String[] args) {
        String arr[]={"sakil", "is a","boy"};
        System.out.println("Using map()");
        Stream.of(arr).map(x->x.split(" ")).forEach(x-> System.out.println(Arrays.toString(x)));
        /* map is 1 to 1 mapping exp: [[5],[10,8],[7]]
        [sakil]
        [is, a]
        [boy]
         */
        System.out.println("Using FlatMap()");
        Stream.of(arr).flatMap(x->Stream.of(x.split(" "))).forEach(x-> System.out.println(x));
        /* flatMap is 1 to N mapping exmp: [10,5,7,9]
        sakil
        is
        a
        boy
         */

    }
}
