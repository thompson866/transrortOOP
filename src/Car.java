public class Car extends Transport {

    public Car(String modelName, int wheelCount){
        super (modelName,wheelCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
