package com.litecode.learnspringframework.game;

import com.litecode.learnspringframework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole {
    public void up(){
        System.out.println("Go Up");
    }
    public void down(){
        System.out.println("Go Down");
    }
    public void left(){
        System.out.println("Go left");
    }

    public void right(){
        System.out.println("Go Right");
    }
}
