package com.litecode.learnspringframework.game;

import com.litecode.learnspringframework.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("Sit Down");
    }
    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Shoot boolet");
    }
}
