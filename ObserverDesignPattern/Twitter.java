package ObserverDesignPattern;

public class Twitter extends Observer {

    @Override
    public void get_notified(Subject subject) {
        int weather = subject.get_state();
        System.out.println("Twitter knows that temp is " + weather+" degrees Celsius");
    }
}
