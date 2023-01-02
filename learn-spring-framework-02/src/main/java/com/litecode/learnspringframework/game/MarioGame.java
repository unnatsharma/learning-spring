package com.litecode.learnspringframework.game;

import com.litecode.learnspringframework.GamingConsole;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into hole");
    }
    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Accelerate");
    }
}

