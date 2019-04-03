package Tasks_1_2_3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", "Bolton", "QA Engineer", "abolton@somecompany.com", 35000,29);
        System.out.println(employee1);
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int salary;
    private int age;

    public Employee (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

}


