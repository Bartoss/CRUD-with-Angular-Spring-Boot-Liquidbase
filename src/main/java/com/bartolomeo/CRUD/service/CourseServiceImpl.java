package com.bartolomeo.CRUD.service;

import com.bartolomeo.CRUD.model.Course;
import com.bartolomeo.CRUD.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course){
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId){
        courseRepository.deleteById(courseId);
    }

    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }
}
