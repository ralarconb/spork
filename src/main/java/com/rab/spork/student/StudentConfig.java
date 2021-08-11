package com.rab.spork.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student st1 = new Student("Mily", "m.cori@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), "15991156");
			Student st2 = new Student("Ric", "r.dextre@gmail.com", LocalDate.of(2000, Month.MARCH, 15), "32154749");
			repository.saveAll(List.of(st1, st2));
		};
	}

}