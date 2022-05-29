package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations2 {
    public static void main(String[] args) {
        /*
            toList()
            toSet()
            toMap(keyMapper,valueMapper)

            groupingBy(Function) -grouping stream of elements using a function into a map
            groupingBy(Function,Collector)-
         */

        Stream<Student> studentStream=Stream.of(
                new Student(11,"Sakil",70),
                new Student(10,"Avik",80),
        new Student(12,"Tanmay",70)
        );

       /* Map<Integer, Student> studentMap = studentStream.collect(Collectors.toMap(Student::getId, Function.identity()));

        System.out.println(studentMap);

        // output: {10=Student{id=10, name='Avik', score=80.0}, 11=Student{id=11, name='Sakil', score=70.0}, 12=Student{id=12, name='Tanmay', score=70.0}}
        */

        /*
        Map<Double, List<Student>> groupByScore = studentStream.collect(Collectors.groupingBy(Student::getScore));
        System.out.println(groupByScore);
        // output: {70.0=[Student{id=11, name='Sakil', score=70.0}, Student{id=12, name='Tanmay', score=70.0}], 80.0=[Student{id=10, name='Avik', score=80.0}]}
        */

        //count by score
        Map<Double, Long> countingStudentByScore = studentStream.collect(Collectors.groupingBy(Student::getScore, Collectors.counting()));
        System.out.println(countingStudentByScore);

        //{70.0=2, 80.0=1}


    }
}
class Student
{
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
