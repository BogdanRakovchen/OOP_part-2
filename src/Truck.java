public class Truck extends Car {
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public String getModelName() {
        return modelName;
    }


    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }


}
