package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args){

        Decorator word = new A(new B(new C(null)));

        word.add();
    }


}
