package ObserverDesignPattern;

public class Main {

    public static void main(String[] args){
    Subject forecast = new WeatherForecast();
    Observer twitter = new Twitter();
    Observer instagram = new Instagram();

    twitter.attach_me(forecast);
    instagram.attach_me(forecast);

    forecast.set_state(15);
    System.out.println("-----------------");
    twitter.de_attach_me(forecast);
    forecast.set_state(25);


    }
}
