package ru.skypro;

public abstract class EngineTransport extends Transport {

    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service(){
        super.service();
        checkEngine();
    }
}
