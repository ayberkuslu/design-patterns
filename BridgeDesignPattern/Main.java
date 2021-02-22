package BridgeDesignPattern;

public class Main {

    public static void main(String [] args){
        Transporter transporter = new Jet(new JetEngine());

        int i = 0;
        while(i++ < 20){
            transporter.transport();
            transporter = transporter.changeTransportOption();
            System.out.println("-------------------------");
        }
    }
}
