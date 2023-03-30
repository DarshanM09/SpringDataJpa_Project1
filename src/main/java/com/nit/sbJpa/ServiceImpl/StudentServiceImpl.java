package com.nit.sbJpa.ServiceImpl;

import com.nit.sbJpa.Entity.Student;
import com.nit.sbJpa.Repository.StudentRepository;
import com.nit.sbJpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        Student studentObj = studentRepository.save(student);
        return studentObj;
    }

    @Override
    public Student UpdateStudentInfo(Student student, Integer id) {

        Student existingStudent = studentRepository.findById(id).get();
        existingStudent.setName(student.getName());
        existingStudent.setSurname(student.getSurname());
        existingStudent.setStandard(student.getStandard());
        existingStudent.setGrade(student.getGrade());
        existingStudent.setFees_paid(student.getFees_paid());
        Student UpdatedStudent = studentRepository.save(existingStudent);

        return UpdatedStudent;
    }

    @Override
    public List<Student> GetAllStudent() {

        List<Student> studentList = studentRepository.findAll();


        return studentList;
    }

    @Override
    public void deleteStudent(Integer id) {
        Student studToDelete = studentRepository.findById(id).get();

        studentRepository.delete(studToDelete);

    }

    @Override
    public Student GetSingleStudInfo(Integer id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    @Override
    public Student GetStudentByName(String name) {

        Student StudentByname = studentRepository.findByName(name);


        return StudentByname;
    }

    @Override
    public double GetsumOfFees() {

        double sum = studentRepository.GetSumOfFees();

        return sum;
    }

}
