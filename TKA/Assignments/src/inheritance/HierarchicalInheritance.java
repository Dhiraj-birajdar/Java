package inheritance;

class Vehicle {
    void run() {
        System.out.println("Vehicle class");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike class");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car class");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Bike Bike = new Bike();
        Bike.run();  // Inherited from Vehicle class
        Bike.ride(); // Specific to Bike class

        Car car = new Car();
        car.run();  // Inherited from Vehicle class
        car.drive(); // Specific to Car class
    }
}

