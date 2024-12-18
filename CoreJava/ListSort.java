import java.util.*;

public class ListSort {

    public static void main(String args[]) {
        // List of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 1000, "John"));
        employees.add(new Employee(2, 2000, "Jane"));
        employees.add(new Employee(3, 3000, "Doe"));
        employees.add(new Employee(4, 4000, "Smith"));
        employees.add(new Employee(5, 5000, "Doe"));
        employees.add(new Employee(6, 6000, "Smith"));

        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("Sorted Employees by Salary (Descending):");
        employees.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

        // List of Integers
        List<Integer> integers = Arrays.asList(5, 3, 8, 1, 9, 2);
        integers.sort(Collections.reverseOrder());
        System.out.println("\nSorted Integers (Descending):");
        integers.forEach(System.out::println);

        // List of Doubles
        List<Double> doubles = Arrays.asList(5.5, 3.3, 8.8, 1.1, 9.9, 2.2);
        doubles.sort(Collections.reverseOrder());
        System.out.println("\nSorted Doubles (Descending):");
        doubles.forEach(System.out::println);

        // List of Strings
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        strings.sort(Collections.reverseOrder());
        System.out.println("\nSorted Strings (Descending):");
        strings.forEach(System.out::println);

        // List of Characters
        List<Character> characters = Arrays.asList('d', 'a', 'c', 'b');
        characters.sort(Collections.reverseOrder());
        System.out.println("\nSorted Characters (Descending):");
        characters.forEach(System.out::println);
    }
}

class Employee {
    int id;
    double salary;
    String name;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}