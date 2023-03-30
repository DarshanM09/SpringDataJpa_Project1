package com.nit.sbJpa.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sbJpa.Entity.Teacher;
import com.nit.sbJpa.Repository.TeacherRepository;
import com.nit.sbJpa.Service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository repository;
	@Override
	public Teacher createTeacher(Teacher teacher) {

		
		Teacher save = repository.save(teacher);

		
		return save;
	}

	@Override
	public Teacher UpdateTeacher(Teacher teacher, Integer TeacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> GetAllTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTeacher(Integer TeacherId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Teacher GetSingleTeacherInfo(Teacher teacher, Integer TeacherId) {
		// TODO Auto-generated method stub
		return null;
	}

}
