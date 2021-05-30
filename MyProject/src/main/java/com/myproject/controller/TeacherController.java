package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myproject.bean.Teacher;
import com.myproject.exceptionhandling.TeacherNotFoundException;
import com.myproject.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(TeacherController.class);
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/create")
	public Teacher createTeacher(@RequestBody Teacher teacher) {
		LOGGER.info("inside the createTeacher of TeacherController");
		return teacherService.createteacher(teacher);
	}
	
	@GetMapping("/getbyid/{teacherId}")
	public Teacher getTeacherById(@PathVariable String teacherId) throws TeacherNotFoundException{
		LOGGER.info("inside the getTeacherById of TeacherController");
		return teacherService.getteacherbyid(teacherId);
	}

}
