package BridgeDesignPattern2;

public class Main {

    public static void main(String[] args){
        Bridge host = new Bridge(new Talker1(), new English());

        int i = 0;
        while (i ++ <10){
            host.speak();
            host.switchTL();
            System.out.println("-----------------");
        }


    }
}
