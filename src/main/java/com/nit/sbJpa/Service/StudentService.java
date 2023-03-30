package com.nit.sbJpa.Service;

import com.nit.sbJpa.Entity.Student;

import java.util.List;

public interface StudentService {

    //to create new student
    Student createStudent(Student student);
    //Update student info
    Student UpdateStudentInfo(Student student,Integer id);
    //get all student
    List<Student> GetAllStudent();
    //delete student
    void deleteStudent(Integer id);
    //get onlry one student by student id
    Student GetSingleStudInfo(Integer id);

    //get student by name
    Student GetStudentByName(String name);

    double GetsumOfFees();

}
