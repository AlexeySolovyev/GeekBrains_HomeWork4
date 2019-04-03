package Tasks_1_2_3;

class Employee {
    String firstName;
    String lastName;
    String position;
    String email;
    int salary;
    int age;

    public Employee (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", "Bolton", "QA Engineer", "abolton@somecompany.com", 35000,29);
        Employee employee2 = new Employee("Bob", "Marley", "Sofware Engineer", "bmarley@somecompany.com", 76000,34);

        System.out.println(employee1.firstName + " " + employee1.lastName + ", " + employee1.position + ", email:" + employee1.email + ", salary: $" + employee1.salary + ", age: " + employee1.age);
        System.out.println(employee2.firstName + " " + employee2.lastName + ", " + employee2.position + ", email:" + employee2.email + ", salary: $" + employee2.salary + ", age: " + employee2.age);
    }
}


