package com.myproject.exceptionhandling;

public class TeacherNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeacherNotFoundException() {
		super();
	}
	
    public TeacherNotFoundException(String message) {
    	super(message);
	}
	
	

}
