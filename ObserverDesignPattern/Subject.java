package ObserverDesignPattern;

public interface Subject {

    public void notify_observers();
    public void set_state(int new_temp);
    public void attach(Observer observer);
    public void de_attach(Observer observer);
    public int get_state();

}
