public class ServiceStation {
    public void check(Car car) {
        checkWheeledTransport(car);
        car.checkEngine();
    }


    public void check(Truck truck) {

        checkWheeledTransport(truck);
        truck.checkEngine();
        truck.checkTrailer();

    }


    public void check(Bicycle bicycle) {

        checkWheeledTransport(bicycle);
    }

    private void checkWheeledTransport(Transport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
}

