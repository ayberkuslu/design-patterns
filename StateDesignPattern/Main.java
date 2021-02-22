package StateDesignPattern;

public class Main {

    public static void main(String[] args){
        StateContext lamp = new StateContext();
        int i = 0;
        while(i++ < 10){
            lamp.flip();
        }

    }
}
