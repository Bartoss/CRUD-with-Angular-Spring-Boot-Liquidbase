package com.bartolomeo.CRUD.service;

import com.bartolomeo.CRUD.model.CourseStudent;
import com.bartolomeo.CRUD.repository.CourseStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseStudentServiceImpl implements CourseStudentService {

    @Autowired
    private CourseStudentRepository courseStudentRepository;

    public CourseStudent saveCourseStudent(CourseStudent courseStudent){
        return courseStudentRepository.save(courseStudent);
    }

    public List<CourseStudent> findAllCoursesOfStudent(Long studentId){
        return courseStudentRepository.findByStudentId(studentId);
    }

    public List<CourseStudent> findAllStudentsOfInstructor(Long instructorId){
        return courseStudentRepository.findByCourseInstructorId(instructorId);
    }

    public List<CourseStudent> findAllEnrolments(){
        return courseStudentRepository.findAll();
    }
}
