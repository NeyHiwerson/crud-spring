package com.ney;

import com.ney.model.Course;
import com.ney.repository.CourseRepository;
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
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c01 = new Course();
			c01.setName("Angular com Spring");
			c01.setCategory("front-end");
			courseRepository.save(c01);

			Course c02 = new Course();
			c02.setName("HTML");
			c02.setCategory("front-end");
			courseRepository.save(c02);

			Course c03 = new Course();
			c03.setName("Angular Avançado");
			c03.setCategory("front-end");
			courseRepository.save(c03);

			Course c04 = new Course();
			c04.setName("SpringBoot");
			c04.setCategory("back-end");
			courseRepository.save(c04);
		};
	}
}
