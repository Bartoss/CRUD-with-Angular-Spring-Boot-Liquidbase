package com.bartolomeo.CRUD.service;

import com.bartolomeo.CRUD.model.Course;

import java.util.List;

public interface CourseService {

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(Long courseId);

    public List<Course> findAllCourses();
}
