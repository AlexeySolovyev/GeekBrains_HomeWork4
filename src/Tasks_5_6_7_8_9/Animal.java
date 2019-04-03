package Tasks_5_6_7_8_9;

public class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public double run(double speed) {
        return speed;
    }
    public double swim(double distance) {
        return distance;
    }
    public double jump(double height) {
        return height;
    }

}
