package com.kailin.child.model01;
import org.junit.*;
import org.junit.Assert.*;

public class TomTest {
    @Test
    public void testTom(){
        Assert.assertEquals("Hello,I am Tom",new Tom().sayHello());
        System.out.println(new Tom().sayHello());
    }
}
