package com.bit.springboot.dao;

import java.util.List;
import java.util.UUID;

import com.bit.springboot.model.Student;

public interface StudentDao {

	int insertStudent(UUID studentId, Student student);

	Student selectStudentById(UUID studentId);

	List<Student> selectAllStudents();

	int updateStudentById(UUID studentId, Student studentUpdated);

	int deleteStudentById(UUID studentId);

}
