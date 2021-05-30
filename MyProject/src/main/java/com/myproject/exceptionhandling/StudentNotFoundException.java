package com.myproject.exceptionhandling;

public class StudentNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public StudentNotFoundException() {
		super();
	}
	
	
	public StudentNotFoundException(String message) {
		super(message);
	}
	
	

}
