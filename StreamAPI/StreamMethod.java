package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {

        /*
            filter(Predicate)
            Predicate means boolean value function alwyas return true or false
            i->{ return true/false}
         */

        //Example filter out thename whose names are start with A
        List<String > names=  Arrays.asList("Sakil","Aman","Durgesh","Anupam");
        List<String > namesWithA=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesWithA);

        System.out.println("___________");
        //Example filter out thename whose names length is greater than 5
        List<String > names2=  Arrays.asList("Sakil","Saikat","Seth","Anupam");
        names2.stream().filter(e->e.length()>5).forEach(k->{ System.out.println(k); });

        System.out.println("___________");

        /*
            map(Function)
            Function return value;
            by using map we can perform operation in  each element
         */

        // list of number present you can return all number as a square form then use map

        List<Integer> list2=Arrays.asList(5,7,8,4,9);
        List<Integer> squareOfList2= list2.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(squareOfList2);
        System.out.println("___________");
        // forEach method using (System.out::println)

        squareOfList2.stream().forEach(System.out::println);

        System.out.println("______After sort _____");
        //CollectMethod as a list store,as a set

        // Sorted
        squareOfList2.stream().sorted().forEach(System.out::println);
        System.out.println("______________");
        //min

        Integer minNo=list2.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(list2);
        System.out.println("Min: "+minNo);

        Integer maxNo=list2.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max: "+maxNo);
    }
}
