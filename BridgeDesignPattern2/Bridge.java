package BridgeDesignPattern2;
import java.util.Random;

public class Bridge {

public Language language;
public Talker talker;

public Bridge(Talker talker, Language language){
    this.language = language;
    this.talker = talker;
}

public void speak(){
    talker.talk();
    language.speakLanguage();
}


public void switchTL(){

    Random random = new Random();
    int t = random.nextInt(2);
    int l = random.nextInt(2);
    if(t == 1){
        this.language = new Spanish();
    }
    else{
        this.language = new English();
    }

    if(l == 1){
        this.talker = new Talker2();
    }
    else{
        this.talker = new Talker1();
    }
}
}
