public class Bicycle extends Car {
//    инкапсуляция
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }


    @Override
    public String getModelName() {
        return modelName;
    }



    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }


}
