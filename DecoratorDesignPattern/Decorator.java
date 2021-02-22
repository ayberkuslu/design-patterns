package DecoratorDesignPattern;

public abstract class Decorator {

    Decorator decorator;

    public Decorator(Decorator decorator){
        this.decorator = decorator;
    }

    public abstract void add();
}
