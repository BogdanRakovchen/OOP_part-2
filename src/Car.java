// наследование
public class Car extends Transport implements ServiceInterface {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

        @Override
        public void check() {

            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();

    }


    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }




}
