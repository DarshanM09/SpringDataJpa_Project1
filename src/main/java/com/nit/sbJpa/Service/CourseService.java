package com.nit.sbJpa.Service;

import java.util.List;

import com.nit.sbJpa.Entity.Course;
import com.nit.sbJpa.Entity.CourseMaterial;
import com.nit.sbJpa.Entity.Student;
import com.nit.sbJpa.Entity.Teacher;

public interface CourseService {
	
	Course createCourse(Course course);

	Course updateCourse(Course course,Integer CourseId);
	
	List<Course> GetAllCourse();
	
	void deleteCourse(Integer courseId);
	
	Course GetSingleCourseInfo(Course course,Integer CourseId);
	
	List<String> getStudentByCourses(String Coursename);
}
