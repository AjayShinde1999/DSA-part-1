package part_6;

class Vehicle {
    void move() {
        System.out.println("Vehicle Moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.move();

        v = new Bike();
        v.move();
    }
}
