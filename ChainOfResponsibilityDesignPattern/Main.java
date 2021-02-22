package ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[]args){
        Person ceren = new Ceren(new ArrayList<String>(Arrays.asList("fr", "tr", "en")),null);
        Person berk = new Berk(new ArrayList<String>(Arrays.asList("tr","en")),ceren);
        Person ahmet = new Ahmet(new ArrayList<String>(Arrays.asList("tr","en")),berk);

        ahmet.try_speak("fr");


    }

}
