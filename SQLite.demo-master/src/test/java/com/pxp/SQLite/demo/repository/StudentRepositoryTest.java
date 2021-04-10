/**
 * 
 */
package com.pxp.SQLite.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pxp.SQLite.demo.entity.Student;

/**
 * Test du Repository StudentRepositoryTest
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {


	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}
	/**/
	@Test
	public void getAllStudents() throws Exception {

    	//given
		StudentRepository studentRepository = mock(StudentRepository.class);
		
		Student student1 = new Student();
		student1.setName("Carla");			
		student1.setEmail("carla@gmail.com");	
		
		
		Student student2 = new Student();
		student2.setName("Julie");
		student2.setEmail("julie@gmail.com");	
		
		Student student3 = new Student();
		student3.setName("Eddy");			
		student3.setEmail("eddy@gmail.com");	
		
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		
		//when
		when(studentRepository.findAll()).thenReturn(listStudents);
		List<Student> result = studentRepository.findAll();
		
	    //print
	    System.out.println("StudentRepositoryTest || getAllStudents result[=> index(0) name + Email ] :" + result.get(0).getName() + " " + result.get(0).getEmail() );
		
		//verify
		assertEquals(3, result.size());
	}	


}
