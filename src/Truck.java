public class Truck extends Transport implements TransportRoad {

    public Truck(String modelName, int wheelCount){
        super (modelName,wheelCount);
    }

@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }
    @Override

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
