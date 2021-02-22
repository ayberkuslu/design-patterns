package BridgeDesignPattern;

public class HeliEngine implements EngineBridge {


    public void startEngine(){
        System.out.println("Helicopter engine started!!");
    }

    public String getEngine(){
        return "HeliEngine";
    }

}
