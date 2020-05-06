package com.bartolomeo.CRUD.service;

import com.bartolomeo.CRUD.model.CourseStudent;

import java.util.List;

public interface CourseStudentService {

    CourseStudent saveCourseStudent(CourseStudent courseStudent);

    List<CourseStudent> findAllCoursesOfStudent(Long studentId);

    List<CourseStudent> findAllStudentsOfInstructor(Long instructorId);

    List<CourseStudent> findAllEnrolments();
}
