package Example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Emp implements Comparable<Emp> {
    private int id;
    private String name;
    private String role;

    public Emp(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        if(id==o.getId())
            return 0;
        else if(id<o.getId())
            return -1;
        else
        return 1;
    }
}



public class EmpTest {
    public static void main(String[] args) {
        List<Emp> employeeList= new ArrayList<>();
        employeeList.add(new Emp(10,"Sakil","Trainee Dev"));
        employeeList.add(new Emp(105,"Avik","DEv"));
        employeeList.add(new Emp(95,"Sanjay","HR"));

        for(Emp e:employeeList)
        {
            System.out.println(e);
        }
        System.out.println("________");
        Collections.sort(employeeList);
        for(Emp e:employeeList)
        {
            System.out.println(e);
        }



    }
}
