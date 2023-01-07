package com.litecode.springboot.learnspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","liteCode"),
                new Course(2,"Learn DevOps","liteCode"),
                new Course(3,"Learn Azure","liteCode"),
                new Course(4,"Learn Azure","liteCode")
        );
    }
}
