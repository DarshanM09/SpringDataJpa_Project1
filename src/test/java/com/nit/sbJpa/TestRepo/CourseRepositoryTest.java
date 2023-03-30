package com.nit.sbJpa.TestRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.sbJpa.Entity.Course;
import com.nit.sbJpa.Entity.CourseMaterial;
import com.nit.sbJpa.Repository.CourseRepository;

@SpringBootTest
public class CourseRepositoryTest {

	
	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void CreateCourse() {
		
		
		CourseMaterial courseMaterial=CourseMaterial.builder().Url("www.google.com").build();
		
		Course course=Course.builder().courseMaterial(courseMaterial).credit(2).title("Java111").build();
		
		Course save = courseRepository.save(course);
		System.out.println(save);

		
		
		
	}
}
