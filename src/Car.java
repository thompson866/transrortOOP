public class Car extends Transport {

    public Car(String modelName, int wheelCount){
        super (modelName,wheelCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
