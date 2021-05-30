package com.myproject.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document("TEACHER")
public class Teacher {
	
	@Id
	@JsonIgnore
	private String teacherId;
	private String teacherName;
	private String teacherSalary;
	private String teacherDegree;
	
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(String teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	public String getTeacherDegree() {
		return teacherDegree;
	}
	public void setTeacherDegree(String teacherDegree) {
		this.teacherDegree = teacherDegree;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSalary=" + teacherSalary
				+ ", teacherDegree=" + teacherDegree + "]";
	}
	
	
	

}
