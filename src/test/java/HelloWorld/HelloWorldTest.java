package HelloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSay(){
        HelloWorld helloWord = new HelloWorld();
        String result = helloWord.say();
        assertEquals("hello maven",result);
    }
}
