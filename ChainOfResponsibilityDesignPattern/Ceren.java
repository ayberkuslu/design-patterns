package ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;

public class Ceren extends Person {
    public Ceren(ArrayList<String> langs, Person supervisor) {
        super(langs,supervisor);
    }

    @Override
    public void try_speak(String lang) {
        if(super.languages.contains(lang)){
            System.out.println("Ceren " + lang + " dilinde konustu.");
        }
        else if(super.supervisor == null){
            System.out.println("Ceren bu dili bilmiyor ve Cerenin supervisoru yok!");

        }
        else{

            System.out.println("Ceren bu dili bilmedigi icin supervisor'ına soruyor :");
            super.supervisor.try_speak(lang);
        }
    }


}
