package com.nit.sbJpa.Service;

import java.util.List;


import com.nit.sbJpa.Entity.Teacher;

public interface TeacherService {
	
	Teacher createTeacher(Teacher teacher);

	Teacher UpdateTeacher(Teacher teacher,Integer TeacherId);
	
	List<Teacher> GetAllTeacher();
	
	void deleteTeacher(Integer TeacherId);
	
	Teacher GetSingleTeacherInfo(Teacher teacher,Integer TeacherId);
}
