package BridgeDesignPattern;

public class CarEngine implements EngineBridge {



    public void startEngine(){
        System.out.println("Car engine started!!");
    }

    public String getEngine(){
        return "CarEngine";
    }
}
