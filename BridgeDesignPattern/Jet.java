package BridgeDesignPattern;

public class Jet extends Transporter {
    public Jet(EngineBridge engine) {
        super(engine);
    }

    @Override
    public void transport() {
//        engine.startEngine();
        System.out.println("Transporting via Jet!");
    }
}
