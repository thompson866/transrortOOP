public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelCount){
        super (modelName,wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");

    }
}
