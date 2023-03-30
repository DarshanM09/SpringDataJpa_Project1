package com.nit.sbJpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.sbJpa.Entity.Teacher;
import com.nit.sbJpa.Service.TeacherService;

@RestController
@RequestMapping("/mit/teacher")
public class TeacherController {

	
	@Autowired
	private TeacherService service;
	
	@PostMapping("/keep")
	public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher){
		
		Teacher createTeacher = service.createTeacher(teacher);
		
		return new ResponseEntity<Teacher>(createTeacher,HttpStatus.CREATED);
	}
}
