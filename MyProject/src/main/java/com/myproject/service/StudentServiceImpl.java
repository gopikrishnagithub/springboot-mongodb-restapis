package com.myproject.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bean.Student;
import com.myproject.exceptionhandling.StudentNotFoundException;
import com.myproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createstudent(Student student) {
		student.setStudentId(UtilityServices.getPrimaryKey());
		return studentRepository.save(student);
	}

	@Override
	public Student findstudentbyid(String studentId) throws StudentNotFoundException{
		Optional<Student> student=studentRepository.findById(studentId);
		if(!student.isPresent()) {
			throw new StudentNotFoundException("data not avilable on this id");
		}
		return student.get();
	}

	@Override
	public List<Student> findallstudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student updatestudent(String studentId, Student student) throws Exception {
		Student students=studentRepository.findById(studentId).get();
		if(students==null ) {
			throw new NoSuchElementException("data not avilable on this id");
		}else {
			students.setStudentClass(student.getStudentClass());
			students.setStudentName(student.getStudentName());
			students.setStudentNumber(student.getStudentNumber());
			return studentRepository.save(students);
		}
		
	}
	

}
