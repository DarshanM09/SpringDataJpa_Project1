package com.nit.sbJpa.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sbJpa.Entity.Course;
import com.nit.sbJpa.Entity.CourseMaterial;
import com.nit.sbJpa.Entity.Student;
import com.nit.sbJpa.Entity.Teacher;
import com.nit.sbJpa.Repository.CourseMaterialRepository;
import com.nit.sbJpa.Repository.CourseRepository;
import com.nit.sbJpa.Service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	

	
	
	@Override
	public Course createCourse(Course course) {

		//	

		
		
		
	
		Course save = courseRepository.save(course);
		
		
		return save;
	}

	

	@Override
	public Course updateCourse(Course course, Integer CourseId) {

		Course ExistingCourse = courseRepository.findById(CourseId).get();

		ExistingCourse.setTitle(course.getTitle());
		ExistingCourse.setCredit(course.getCredit());
		Course UPdatedCourse = courseRepository.save(ExistingCourse);
		
		
		return UPdatedCourse;
	}

	@Override
	public List<Course> GetAllCourse() {


		List<Course> allCourse = courseRepository.findAll();
		
		return allCourse;
	}

	@Override
	public void deleteCourse(Integer courseId) {


		
		Course course = courseRepository.findById(courseId).get();
		courseRepository.delete(course);
		
	}

	@Override
	public Course GetSingleCourseInfo(Course course, Integer CourseId) {

		Course course2 = courseRepository.findById(CourseId).get();

		
		return course2;
	}

	@Override
	public List<String> getStudentByCourses(String Coursename) {
		List<String> allStudentByCourse = courseRepository.getAllStudentByCourse(Coursename);

		return allStudentByCourse;
	}


}
