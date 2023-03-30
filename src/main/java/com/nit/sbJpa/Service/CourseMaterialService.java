package com.nit.sbJpa.Service;

import java.util.List;


import com.nit.sbJpa.Entity.CourseMaterial;

public interface CourseMaterialService {

	
	CourseMaterial createCourse(CourseMaterial courseMaterial);

	CourseMaterial updateCourse(CourseMaterial courseMaterial,Integer courseMaterialId);
	
	List<CourseMaterial> GetAllCourse();
	
	void deleteCourse(Integer CourseMaterialId);
	
	CourseMaterial GetSingleCourseMaterialInfo(CourseMaterial courseMaterial,Integer CourseMaterialId);
}
