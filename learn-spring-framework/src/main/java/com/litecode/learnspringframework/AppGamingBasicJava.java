package com.litecode.learnspringframework;

import com.litecode.learnspringframework.game.GameRunner;
import com.litecode.learnspringframework.game.MarioGame;
import com.litecode.learnspringframework.game.PackmanGame;
import com.litecode.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PackmanGame(); // 1: onbject creation
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}