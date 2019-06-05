package com.kailin.maven02.model01;
import org.junit.*;
import org.junit.Assert.*;

public class RobotTest {
    @Test
    public void testRobot(){
        System.out.println(new Robot().sayHello());
    }
}
