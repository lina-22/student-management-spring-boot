package com.studentmanagementsystem;

import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(1L,"Lina","Haque", "lina@gmail.com");
		student1.getFirstName();

//		studentRepository.save(student1);
//		Student student2 = new Student(2L,"Lina22","Haque22", "lina@gmail22.com");
//		studentRepository.save(student2);
//		Student student3 = new Student(3L,"Lina33","Haque33", "lina@gmail33.com");
//		studentRepository.save(student3);
//		Student student4 = new Student(4L,"Lina44","Haque44", "lina@gmail44.com");
//		studentRepository.save(student4);
	}
}
