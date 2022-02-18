import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTestJunit4 {

    @Test
    public void javaHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.javaHelloWorld());
    }
}