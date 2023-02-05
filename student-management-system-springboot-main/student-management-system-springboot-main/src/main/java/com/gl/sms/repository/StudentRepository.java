package com.gl.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
