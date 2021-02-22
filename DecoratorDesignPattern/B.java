package DecoratorDesignPattern;

public class B extends Decorator {
    public B(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void add() {
        if(super.decorator != null){
            super.decorator.add();
        }
        System.out.println("B");
    }
}
