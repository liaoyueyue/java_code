/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-11-27
 * Time: 17:28
 */


class Vehicle {
    int wheels;
    double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}

class Car2 extends Vehicle {
    int loader;

    public Car2(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}

class Truck extends Car2 {
    double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                ", loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}

public class Example3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2, 60);
        System.out.println(vehicle.toString());
        Car2 car2 = new Car2(4, 80, 4);
        System.out.println(car2.toString());
        Truck truck = new Truck(8, 180, 2, 300);
        System.out.println(truck.toString());
    }
}
