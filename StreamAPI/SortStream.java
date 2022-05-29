package StreamAPI;

import java.util.Arrays;

public class SortStream {
    public static void main(String[] args) {
        String arr[]={"ab","pqr","mn","c","de","xz"};
        System.out.println("with out Comparator");
        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println("with Comparator Natural order");
        Arrays.stream(arr).sorted((x,y)->x.compareTo(y)).forEach(System.out::println);
        System.out.println("with Comparator Descending order");
        Arrays.stream(arr).sorted((x,y)-> -1* (x.compareTo(y))).forEach(System.out::println);// multiple by -1



    }
}
