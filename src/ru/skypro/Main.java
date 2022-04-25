package ru.skypro;

public class Main {
    public static void main(String[] s) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1");
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        TransportCheck[] vehicles = {
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };

        ServiceStation station = new ServiceStation();
        for(TransportCheck vehicle:vehicles){
            station.check(vehicle);
        }
    }
}
