package DecoratorDesignPattern;

public class C extends Decorator {

    public C(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void add() {
        if(super.decorator != null){
            super.decorator.add();
        }
        System.out.println("C");
    }
}
