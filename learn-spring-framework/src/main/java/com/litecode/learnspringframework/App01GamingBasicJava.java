package com.litecode.learnspringframework;

import com.litecode.learnspringframework.game.GameRunner;
import com.litecode.learnspringframework.game.PackmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PackmanGame(); // 1: onbject creation
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}