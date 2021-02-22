package ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;

public abstract class Person {
    ArrayList<String >languages;
    Person supervisor;

    public Person(ArrayList<String> langs, Person supervisor){
        this.languages = langs;
        this.supervisor = supervisor;
    }

    public abstract void try_speak(String lang);



}
