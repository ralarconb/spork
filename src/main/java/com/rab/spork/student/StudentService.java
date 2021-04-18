package com.rab.spork.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Justina", "j.succi@gmail.com", LocalDate.of(2000, Month.APRIL, 6), 22));
	}
}
