package com.kailin.maven02.model01;
import com.kailin.maven01.model01.Tom;

public class Robot {
    public String sayHello(){
        return "I am a Robot.I say : "+new Tom().sayHello();
    }
}
