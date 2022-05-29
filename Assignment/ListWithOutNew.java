package Assignment;
//Create a list containing some elements, without using the "new" operator
import java.util.Arrays;
import java.util.List;

public class ListWithOutNew {
    public static void main(String[] args) {
        List<Integer> l2=Arrays.asList(10,90,5,8,7,46,2);//bY USING asList()
        List<String> s2=Arrays.asList("Sakil","ahammad","laskar");
        for(Integer x:l2)
        {
            System.out.println(x);
        }
        System.out.println("____");

        for(String y:s2)
        {
            System.out.println(y);
        }

    }
}
