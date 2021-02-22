package ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;

public class Berk  extends Person{
    public Berk(ArrayList<String> langs, Person supervisor) {
        super(langs,supervisor);
    }

    @Override
    public void try_speak(String lang) {
        if(super.languages.contains(lang)){
            System.out.println("Berk " + lang + " dilinde konustu.");
        }
        else if(super.supervisor == null){
            System.out.println("Berk bu dili bilmiyor ve Berk'in supervisoru yok!");

        }
        else{
            System.out.println("Berk bu dili bilmedigi icin supervisor'ına soruyor :");
            super.supervisor.try_speak(lang);
        }
    }


}
