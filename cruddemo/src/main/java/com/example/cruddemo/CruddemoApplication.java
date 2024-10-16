package com.example.cruddemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
		{
			return runner->{
				//System.out.println("Hello World!");
			
				createStudent(studentDAO);
			};
		}
		private void createStudent(StudentDAO studentDAO)
		{
			System.out.println("Creating new student object...");
			Student tempStudent = new Student(1, "Ayush", "Mohanty", "xyz@gmail.com");
			
			System.out.println("Saving the student...");
			studentDAO.save(tempStudent);
			
			System.out.println("Saved student. Generated id: " + tempStudent.getRoll());
		}
	
}
