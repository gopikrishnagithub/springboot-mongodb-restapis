package com.myproject.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myproject.bean.Student;
import com.myproject.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/createstudent")
	public Student createStudent(@Valid @RequestBody Student student) {
		return studentService.createstudent(student);
	}
	
	@GetMapping("/byid/{studentId}")
	public Student findStudentbyid(@PathVariable String studentId) throws Exception {
		return studentService.findstudentbyid(studentId);
	}
	
	@GetMapping("/allstudents")
	public List<Student> findAllStudents(){
		return studentService.findallstudents();
	}
	
	@PutMapping("/updatestudent/{studentId}")
	public Student updateStudent(@PathVariable String studentId,@RequestBody Student student) throws Exception {
		return studentService.updatestudent(studentId,student);
	}

}
