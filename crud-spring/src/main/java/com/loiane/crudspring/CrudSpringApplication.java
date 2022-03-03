package com.loiane.crudspring;

import com.loiane.crudspring.entity.Course;
import com.loiane.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository repository){
		return args -> {
			repository.deleteAll();
			Course course = new Course();
			course.setName("JavaScript");
			course.setCategory("Frontend");
			repository.save(course);
		};
	}
}
