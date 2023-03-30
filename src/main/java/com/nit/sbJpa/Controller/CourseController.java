package com.nit.sbJpa.Controller;

import com.nit.sbJpa.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nit.sbJpa.Entity.Course;
import com.nit.sbJpa.Entity.CourseMaterial;
import com.nit.sbJpa.Service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/mit/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/keepcourse")
	public ResponseEntity<Course>CreateCoures(@RequestBody Course course){
		
		Course createCourse = courseService.createCourse(course);
		
		return new ResponseEntity<Course>(createCourse,HttpStatus.CREATED);
	}

//	@GetMapping("/getAllStudent/{Coursename}")
//	public ResponseEntity<List<String>>getllStudent(@PathVariable String Coursename){
//
//		List<String> studentByCourses = courseService.getStudentByCourses(Coursename);
//		return new ResponseEntity<List<String>>(studentByCourses,HttpStatus.OK);
//	}



	@GetMapping("/getAllStudent")
	public ResponseEntity<List<String>>getllStudent(@RequestParam String Coursename){

		List<String> studentByCourses = courseService.getStudentByCourses(Coursename);
		return new ResponseEntity<List<String>>(studentByCourses,HttpStatus.OK);
	}

}

