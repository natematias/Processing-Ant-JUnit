package hello.tests;

import hello.*;

import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testHello()
    {
        Hello h = new Hello();
        assertEquals(h.greet(), "Hello, world");
    }
}
