package BridgeDesignPattern;

public abstract class Transporter {
    public EngineBridge engine;

    public Transporter(EngineBridge engine){
        this.engine = engine;
    }

    public abstract void transport();

    public Transporter changeTransportOption(){

        if(this.engine.getEngine().equals("CarEngine")){
            return new Jet(new JetEngine());
        }
        else if(this.engine.getEngine().equals("JetEngine")){
            return new Helicopter(new HeliEngine());
        }
        else if (this.engine.getEngine().equals("HeliEngine")){
            return new Car(new CarEngine());
        }
        return null;
    }

}
