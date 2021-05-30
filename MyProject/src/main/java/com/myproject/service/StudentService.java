package com.myproject.service;

import java.util.List;

import com.myproject.bean.Student;
import com.myproject.exceptionhandling.StudentNotFoundException;

public interface StudentService {

	public Student createstudent(Student student);

	public Student findstudentbyid(String studentId)throws StudentNotFoundException;

	public List<Student> findallstudents();

	public Student updatestudent(String studentId, Student student)throws Exception;

	
	

}
