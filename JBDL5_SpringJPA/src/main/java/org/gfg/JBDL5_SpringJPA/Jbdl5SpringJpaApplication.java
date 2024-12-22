package org.gfg.JBDL5_SpringJPA;

import org.gfg.JBDL5_SpringJPA.model.Student;
import org.gfg.JBDL5_SpringJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jbdl5SpringJpaApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl5SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Student student = new Student();
		student.setName("Robin");
		student.setEmail("robin@gmail.com");

		studentRepository.save(student);

		System.out.println("data saved");*/

		/*Student student = studentRepository.findById(1).get();

		System.out.println(student);*/

	/*	studentRepository.deleteById(1);

		System.out.println("Data deleted");*/

		//Student student = studentRepository.findByName("Robin");

	//	Student student = studentRepository.findByNameOrEmail("Robin", "robingautam@gmail.com");

		//Student student = studentRepository.findByNameJPQL("Robin");

		//
		// Student student = studentRepository.findByNameAndEmailJPQL("Robin", "robin@gmail.com");

		//Student student = studentRepository.findByNameNative("Robin");

	//	System.out.println(student);

	//	studentRepository.updateName("Robin", "Robin Gautam");

		Student student = studentRepository.findByNameAndEmailJPQL("Robin Gautam","robin@gmail.com");

		System.out.println(student);

	}
}
