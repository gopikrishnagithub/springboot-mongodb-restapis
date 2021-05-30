package com.myproject.service;

import com.myproject.bean.Teacher;
import com.myproject.exceptionhandling.TeacherNotFoundException;

public interface TeacherService {

	public Teacher createteacher(Teacher teacher);

	public Teacher getteacherbyid(String teacherId)throws TeacherNotFoundException;
	
	

}
