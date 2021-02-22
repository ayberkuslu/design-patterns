package BridgeDesignPattern;

public class JetEngine implements EngineBridge {



    public void startEngine(){
        System.out.println("Jet engines started");
    }

    public String getEngine(){
        return "JetEngine";
    }

}
