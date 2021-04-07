package com.bit.springboot.resource;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bit.springboot.model.Student;
import com.bit.springboot.service.StudentService;

@RestController
@RequestMapping("api/v1/students")
public class StudentResource {
	private final StudentService studentService;

	@Autowired
	public StudentResource(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();

	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void ìnsertNewStudent(@RequestBody Student student) {
		studentService.persitNewStudent(UUID.randomUUID(), student);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "{studentId}")
	public Student getStudentById(@PathVariable("studentId") UUID studentId) {
		return studentService.getStudentById(studentId);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, path = "{studentId}")
	public void updateStudentById(@PathVariable("studentId") UUID studentId, @RequestBody Student student) {
		studentService.updateStudentById(studentId, student);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "{studentId}")
	public void deleteStudentById(@PathVariable("studentId") UUID studentId) {
		studentService.deleteStudentById(studentId);
	}

}
