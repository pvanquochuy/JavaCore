package Lamda.example20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortObjectsLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, 1));
        people.add(new Person("Bob", 30, 2));
        people.add(new Person("Charlie", 20, 3));

        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sort list based on age: " );
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
