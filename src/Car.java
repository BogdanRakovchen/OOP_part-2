// наследование
public class Car extends Bicycle {
    //    инкапсуляция
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
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
