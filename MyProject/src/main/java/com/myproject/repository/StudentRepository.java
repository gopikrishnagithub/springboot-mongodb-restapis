package com.myproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myproject.bean.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
	
// public Student findByStudentId(String )
	
}
