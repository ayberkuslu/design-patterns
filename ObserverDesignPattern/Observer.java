package ObserverDesignPattern;

public abstract class Observer {
//    public Subject subject;
//
//    public Observer(Subject subject){
//        this.subject = subject;
//    }


    public void attach_me(Subject subject) {
        subject.attach(this);
    }

    public void de_attach_me(Subject subject) {
        subject.de_attach(this);
    }

    public abstract void get_notified(Subject subject);


}
