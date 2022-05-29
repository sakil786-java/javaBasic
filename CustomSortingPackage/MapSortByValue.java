package CustomSortingPackage;

import java.util.*;

public class MapSortByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Sakil");
        map.put(11, "Watson");
        map.put(26, "AB");
        map.put(5, "Shane Warne");
        map.put(9, "Muthaiya");
        map.put(21, "Swann");

        List<Map.Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<Integer, String>>() {

            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                if (o1.getValue().length() > o2.getValue().length())
                    return 1;
                else if (o1.getValue().length() < o2.getValue().length())
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("Sort By  Length of the values");
        for (Map.Entry<Integer, String> m1 : list1) {
            System.out.println(m1.getKey() + " " + m1.getValue());
        }

    }
}
