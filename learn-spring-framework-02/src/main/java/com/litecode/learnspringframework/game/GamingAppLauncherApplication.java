package com.litecode.learnspringframework.game;

import com.litecode.learnspringframework.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.litecode.learnspringframework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try(var context =  new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}