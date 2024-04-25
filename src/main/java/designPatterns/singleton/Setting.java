package designPatterns.singleton;

public class Setting {
    static Setting instance;

    public final String MODE = "dark";

    private Setting(){

    }//prevent new with private constructor

    public static Setting getInstance(){
        if( Setting.instance == null ){
            Setting.instance = new Setting();
        }
        return Setting.instance;
    }//ensures that only one object can be created
}
