public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4);


        Truck truck = new Truck("truck1", 6);


        Bicycle bicycle = new Bicycle("bicycle1", 2);


        ServiceStation station = new ServiceStation();
        station.checkCar(car);
        station.checkCar(null);
        station.checkBicycle(bicycle);
        station.checkBicycle(null);
        station.checkTruck(truck);
        station.checkTruck(null);

    }
}