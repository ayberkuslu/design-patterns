package ObserverDesignPattern;

public class Instagram extends Observer {


    @Override
    public void get_notified(Subject subject) {
        int weather = subject.get_state();
        System.out.println("Instagram knows that temp is " + weather+" degrees Celsius");
    }
}
