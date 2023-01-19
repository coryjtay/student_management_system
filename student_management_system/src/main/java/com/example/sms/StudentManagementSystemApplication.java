package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Taylor", "Swift", "taylorswift@gmail.com", "8/12/1987", "Cal State University, Long Beach", "Freshman");
		studentRepository.save(student1);

		Student student2 = new Student("James", "Bond", "jamesbond@gmail.com", "11/04/1987", "Cal State University, Fullerton", "Senior");
		studentRepository.save(student2);

		Student student3 = new Student("Tony", "Stark", "tonystark@gmail.com", "03/29/1987", "Cal State University, Northridge", "Junior");
		studentRepository.save(student3);

	}

}
