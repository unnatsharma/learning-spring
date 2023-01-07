package com.litecode.springboot.learnjpaandhibernate.course;

import com.litecode.springboot.learnjpaandhibernate.course.Course;
import com.litecode.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.litecode.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.litecode.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"UnnatJPA","litecode"));
//        repository.insert(new Course(2,"SunnyJPA","litecode"));
//        repository.insert(new Course(3,"SharmaJpa","litecode"));
//
//
//        System.out.println(repository.findById(3L));
//        System.out.println(repository.findById(1L));

        repository.save(new Course(1,"UnnatJPA","litecode"));
        repository.save(new Course(2,"SunnyJPA","litecode"));
        repository.save(new Course(3,"SharmaJpa","litecode"));

        repository.deleteById(3L);


        System.out.println(repository.findById(3L));
        System.out.println(repository.findById(1L));

        System.out.println(repository.count());
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("litecode"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("SunnyJPA"));
    }
}
