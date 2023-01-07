package com.litecode.springboot.learnjpaandhibernate.course.jpa;

import com.litecode.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public  void  insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(Long id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(Long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

}
