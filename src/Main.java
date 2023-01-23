import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person employee1 = new Employee("John", "Lennon", "Security", 27045.78);
        Person employee2 = new Employee("George", "Harrison", "Teacher", 50000);
        Person student1 = new Student("Ringo", "Starr", 2.5);
        Person student2 = new Student("Paul", "McCartney", 3);

        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);
        printData(people);

    }
    public static void printData(ArrayList<Person> people) {
        for (Person a : people) {
            System.out.println(a.toString());
        }
    }
}
