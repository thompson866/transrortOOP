public class Car extends Transport implements TransportRoad{

    public Car(String modelName, int wheelCount){
        super (modelName,wheelCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку  автомобиля");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
