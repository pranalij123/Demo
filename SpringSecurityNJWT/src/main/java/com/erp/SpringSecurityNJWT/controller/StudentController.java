package com.erp.SpringSecurityNJWT.controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import com.erp.SpringSecurityNJWT.Entity.Student;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private List<Student> students=new ArrayList<>(List.of(
			new Student(1,"Pooja",90),
			new Student(2,"neha",95)
			));
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return students;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (CsrfToken)request.getAttribute("_csrf");
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}
}
