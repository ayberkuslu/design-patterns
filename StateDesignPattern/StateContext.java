package StateDesignPattern;

public class StateContext {
    private State lampState;


    public StateContext(){
        lampState = new CloseLampState();
    }

    public void setLampState(State lampState){
        this.lampState = lampState;
    }

    public void flip(){
        lampState.doAction(this);
    }

}
