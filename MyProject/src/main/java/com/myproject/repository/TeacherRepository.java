package com.myproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myproject.bean.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String>{
	
	

}
