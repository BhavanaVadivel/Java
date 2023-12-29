package com.example.demo.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/crud")
public class CRUDController {
	@GetMapping(value="s-01")
	public Student getStudentId() {
		Student s1 = new Student();
		return s1;
	}
}