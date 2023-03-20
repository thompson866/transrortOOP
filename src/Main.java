public class Main {
    public static void main(String[] args) {
        Car car = new Car("автомобиль", 4);
        Car car2 = new Car("автомобиль2", 4);



        Truck truck = new Truck("Фура",6);
        Truck truck2 = new Truck("Фура2", 8);


        Bicycle bicycle = new Bicycle("Велосипед",2);
        Bicycle bicycle2 = new Bicycle("Велосипед2",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}

