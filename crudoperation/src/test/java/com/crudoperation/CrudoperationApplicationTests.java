package com.crudoperation;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperation.entity.student;
import com.crudoperation.repository.StudentRepository;

@SpringBootTest
class CrudoperationApplicationTests {
	@Autowired
	private StudentRepository studentRepo;
	@Test 
	void saveStudent(){
		student s=new student();
		s.setCourse("java");
		s.setName("mojammil");
		s.setFee(30000);
		studentRepo.save(s);	
	}
	@Test
	void deleteStudent() {
		studentRepo.deleteById(3L);
	}
	@Test
	void findStudent() {
		Optional<student> findById = studentRepo.findById(2L);
		student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getFee());
		System.out.println(student.getCourse());
	}
	@Test
	void updatestudent() {
		student s=new student();
		s.setId(1L);
		s.setName("wafa");
		s.setCourse("c++");
		s.setFee(60000);
		studentRepo.save(s);
	}
} 
