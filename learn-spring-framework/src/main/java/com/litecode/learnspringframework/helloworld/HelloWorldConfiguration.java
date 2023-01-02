package com.litecode.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age){};
record Address (String firstline,String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Unnat";
    }

    @Bean
    public int age(){
        return 19;
    }

    @Bean
    public Person person(){
        return new Person("Ravi",20);
    }

    @Bean
    public Address address(){
        return new Address("Gurukul","Ahmedabad");
    }

}
