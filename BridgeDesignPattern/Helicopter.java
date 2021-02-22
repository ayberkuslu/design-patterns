package BridgeDesignPattern;

public class Helicopter extends Transporter {

    public Helicopter(EngineBridge engine) {
        super(engine);
    }

    @Override
    public void transport() {
//        engine.startEngine();

        System.out.println("Transporting via Helicopter!");
    }
}
