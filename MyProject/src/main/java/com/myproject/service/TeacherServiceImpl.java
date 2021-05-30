package com.myproject.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bean.Teacher;
import com.myproject.exceptionhandling.TeacherNotFoundException;
import com.myproject.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(TeacherServiceImpl.class);
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher createteacher(Teacher teacher) {
		LOGGER.info("inside the createteacher of TeacherServiceImpl");
		teacher.setTeacherId(UtilityServices.getPrimaryKey());
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getteacherbyid(String teacherId) throws TeacherNotFoundException{
		Optional<Teacher> existTeacher=teacherRepository.findById(teacherId);
		if(!existTeacher.isPresent()) {
			LOGGER.error("inside the getteacherbyid of TeacherServiceImpl ");
			throw new TeacherNotFoundException("teacher data is not avilable by the given id");
		}
		LOGGER.info("inside the getteacherbyid of TeacherServiceImpl");
		return existTeacher.get();
	}
	
	
	

}
