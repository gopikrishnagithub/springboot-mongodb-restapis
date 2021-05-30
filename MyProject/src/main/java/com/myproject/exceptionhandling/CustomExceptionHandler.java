package com.myproject.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> studentNotFoundException(StudentNotFoundException studentexception,
			WebRequest request){
		
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,studentexception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
	
	
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> teacherNotFoundException(TeacherNotFoundException teacherexception,
			WebRequest request){
		
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,teacherexception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}

}
