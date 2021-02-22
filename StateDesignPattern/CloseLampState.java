package StateDesignPattern;

public class CloseLampState implements State {


    @Override
    public void doAction(StateContext context) {
        System.out.println("Lamp opened");
        context.setLampState(new OpenLampState());
    }



}
