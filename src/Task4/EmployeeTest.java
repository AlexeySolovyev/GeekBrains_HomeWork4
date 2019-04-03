package Task4;

class PersonTest{
    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Junior Software Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30);
        persArray[1] = new Person("Sergeev Sergey", "Software Engineer", " ssergeev@mailbox.com ", "892312312", 30000, 42);
        persArray[2] = new Person("Alexeev Alexey", "QA Engineer", " aalexeev@mailbox.com ", "892312312", 30000, 47);
        persArray[3] = new Person("Petrov Roman", "Product Manager", " rpetrov@mailbox.com ", "892312312", 30000, 29);
        persArray[4] = new Person("Romanov Petr", "Manager", " promanov@mailbox.com ", "892312312", 30000, 64);

        for (Person e : persArray) {
            if (e.getAge() > 40) {
                System.out.println(e.getFirstLastName() + ", age: " + e.getAge());
            }
        }
    }
}
