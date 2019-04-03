package Tasks_5_6_7_8_9;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");

        System.out.println("Dog can run for " + dog.run(500) + " meters" + ", can jump for "+ dog.jump(0.5) + " meter" + " can swim for " + dog.swim(10) + " meter.");
        System.out.println("Cat can run for " + cat.run(200) + " meters" + ", can jump for "+ cat.jump(2) + " meter" + " and can't swim.");
    }
}
