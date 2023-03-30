package com.nit.sbJpa.Controller;

import com.nit.sbJpa.Entity.Student;
import com.nit.sbJpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mit/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/keepStudent")
    public ResponseEntity<Student> CreateStudent(@RequestBody Student student){

        Student CreatedStudent = service.createStudent(student);
        return new ResponseEntity<Student>(CreatedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/updatestudent/{Id}")
    public ResponseEntity<Student> UpdateStudent(@RequestBody Student student,@PathVariable Integer Id){

        Student Updated = service.UpdateStudentInfo(student, Id);

        return new ResponseEntity<Student>(Updated,HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> GetAllStudent(){

        List<Student> students = service.GetAllStudent();
        return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String>DeleteStudent(@PathVariable Integer Id){


        service.deleteStudent(Id);
        return new ResponseEntity<String>("Student Deleted Successfully",HttpStatus.OK);
    }

    @GetMapping("/getSingle/{Id}")
    public ResponseEntity<Student>GetSingleStudentInfo(@PathVariable Integer Id){

        Student student = service.GetSingleStudInfo(Id);
        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

    @GetMapping("/getstudent/{name}")
    public ResponseEntity<Student>GetStudentByName(@PathVariable String name){

        Student student = service.GetStudentByName(name);

        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

    @GetMapping("/getSumfees")
    public ResponseEntity<Double>GetFeesDetailas(){
        double v = service.GetsumOfFees();

        return new ResponseEntity<Double>(v,HttpStatus.OK);
    }
}
