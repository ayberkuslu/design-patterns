package BridgeDesignPattern;

public class Car extends Transporter {
    public Car(EngineBridge engine) {
        super(engine);
    }

    @Override
    public void transport() {
//        engine.startEngine();
        System.out.println("Transporting via Car!");
    }
}
