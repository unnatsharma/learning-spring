package com.litecode.learnspringframework;

import com.litecode.learnspringframework.game.GameRunner;
import com.litecode.learnspringframework.game.PackmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.litecode.learnspringframework.game")
public class App03GamingSpringBeans {

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {

        try(var context =  new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}