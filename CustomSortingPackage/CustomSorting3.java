package CustomSortingPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Text
{
   private  int id;
   private  String name,type;

    public Text(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

public class CustomSorting3 {
    public static void main(String[] args) {
        Comparator<Text> text_name=new Comparator<Text>() {
            @Override
            public int compare(Text o1, Text o2) {
                if( o1.getName().length()> o2.getName().length())
                return 1;
                else if( o1.getName().length()< o2.getName().length())
                    return -1;
                else
                return 0;
            }
        };

        Comparator<Text> text_id=new Comparator<Text>() {
            @Override
            public int compare(Text o1, Text o2) {
                if( o1.getId()> o2.getId())
                    return 1;
                else if( o1.getId()< o2.getId())
                    return -1;
                else
                    return 0;
            }
        };
        List<Text> l1=new ArrayList<Text>();
        l1.add(new Text(10,"Sakil","medium"));
        l1.add(new Text(12,"Abc","largeeeeee"));
        l1.add(new Text(5,"Shibasish","small"));
        l1.add(new Text(43,"Sachin","medium"));
        l1.add(new Text(9,"Triparna","small"));

        System.out.println("Before sort:");
        for(Text t:l1)
        {
            System.out.println(t);
        }

        Collections.sort(l1,text_name);
        System.out.println("After sort by name:");
        for(Text t:l1)
        {
            System.out.println(t);
        }
        Collections.sort(l1,text_id);
        System.out.println("After sort by id:");
        for(Text t:l1)
        {
            System.out.println(t);
        }




    }
}
