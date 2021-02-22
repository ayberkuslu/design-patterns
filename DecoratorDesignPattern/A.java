package DecoratorDesignPattern;

public class A extends Decorator {
    public A(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void add() {
        if(super.decorator != null){
            super.decorator.add();
        }
        System.out.println("A");
    }
}
