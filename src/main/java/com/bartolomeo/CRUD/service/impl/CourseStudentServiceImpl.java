package com.bartolomeo.CRUD.service.impl;

import com.bartolomeo.CRUD.model.CourseStudent;
import com.bartolomeo.CRUD.repository.CourseStudentRepository;
import com.bartolomeo.CRUD.service.CourseStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseStudentServiceImpl implements CourseStudentService {

    @Autowired
    private CourseStudentRepository courseStudentRepository;

    @Override
    public CourseStudent saveCourseStudent(CourseStudent courseStudent){
        return courseStudentRepository.save(courseStudent);
    }

    @Override
    public List<CourseStudent> findAllCoursesOfStudent(Long studentId){
        return courseStudentRepository.findByStudentId(studentId);
    }

    @Override
    public List<CourseStudent> findAllStudentsOfInstructor(Long instructorId){
        return courseStudentRepository.findByCourseInstructorId(instructorId);
    }

    @Override
    public List<CourseStudent> findAllEnrolments(){
        return courseStudentRepository.findAll();
    }
}
