package com.litecode.learnspringframework.game;

import com.litecode.learnspringframework.GamingConsole;

public class GameRunner {
    //private MarioGame game;
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
