package com.gl.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.sms.entity.Student;
import com.gl.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Suresh", "Reddy", "suresh@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Murali", "Mohan", "murali@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Daniel", "Denson", "daniel@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
