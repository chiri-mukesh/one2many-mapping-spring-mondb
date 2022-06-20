package com.rinfotek.springmongodbonetomany.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.rinfotek.springmongodbonetomany.entity.Student;

public interface ImpulseRepository extends MongoRepository<Student,Integer> {

	List<Student> findByName(String name);//from isfcontroller 

//	@Query("{Student.current_class:?0}")//0--> index and it's pass as runtime
//	List<Student> findByCurrentClass(String current_class);

}
