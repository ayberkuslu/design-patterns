package StateDesignPattern;

public class OpenLampState implements State {


    @Override
    public void doAction(StateContext context) {
        System.out.println("Lamp closed");
        context.setLampState(new CloseLampState());
    }
}
