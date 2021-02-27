package ObserverDesignPattern;

import java.util.ArrayList;

public class WeatherForecast implements Subject {

    public int weather_temperature = 10;
    public ArrayList<Observer> observers;

    public WeatherForecast(){
        this.observers = new ArrayList<>();
    }


    @Override
    public void set_state(int new_temp) {
        this.weather_temperature = new_temp;
        this.notify_observers();
    }

    @Override
    public void notify_observers() {
        for (Observer observer : observers){
            observer.get_notified(this);
        }
    }


    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)){
            this.observers.add(observer);
        }else{
            System.out.println("Already attached!");
        }
    }

    @Override
    public void de_attach(Observer observer) {
        if (observers.contains(observer)){
            this.observers.remove(observer);
        }else{
            System.out.println("Already not attached!");
        }
    }

    @Override
    public int get_state() {
        return weather_temperature;
    }


}
