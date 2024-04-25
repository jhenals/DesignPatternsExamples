package designPatterns;

import designPatterns.singleton.Setting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testSingletonInstance(){
        //Get two instances of Setting
        Setting setting1 = Setting.getInstance();
        Setting setting2 = Setting.getInstance();

        //Ensure that both references point to the same objecct
        assertEquals(setting1,setting2);
    }

    @Test
    public void testSingletonMode(){
        //Get an instance of Settings
        Setting settings = Setting.getInstance();
        //check the mode value
        assertEquals("dark", settings.MODE);
    }


}
