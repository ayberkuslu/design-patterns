package ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;

public class Ahmet extends Person {

    public Ahmet(ArrayList<String> langs, Person supervisor) {
        super(langs,supervisor);
    }

    @Override
    public void try_speak(String lang) {
        if(super.languages.contains(lang)){
            System.out.println("Ahmet " + lang + " dilinde konustu.");
        }
        else if(super.supervisor == null){
            System.out.println("Ahmet bu dili bilmiyor ve Ahmet'in supervisoru yok!");

        }
        else{
            System.out.println("Ahmet bu dili bilmedigi icin supervisor'ına soruyor :");
            super.supervisor.try_speak(lang);
        }
    }
}
