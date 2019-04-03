package Task4;

public class Person {

    private String firstLastName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String firstLastName, String position, String email, String phoneNumber, int salary, int age) {
        this.firstLastName = firstLastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
