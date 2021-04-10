package com.pxp.SQLite.demo.controller;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.pxp.SQLite.demo.entity.Student;
import static org.mockito.Mockito.mock;


//import org.junit.jupiter.api.Test;

/**
 * Test du controller:  StudentController
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest {

	  

	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}	

    @Test
    void readStudents() throws Exception {
    	
    	StudentController studentController = mock(StudentController.class);
    	
        // given
        
		Student student1 = new Student();
		student1.setName("Eddy");			
		student1.setEmail("eddy@gmail.com");	
		
		
		Student student2 = new Student();
		student2.setName("Julie");
		student2.setEmail("julie@gmail.com");	
		
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(student1);
		listStudents.add(student2);
    	
		
		//when
	    when(studentController.readStudents()).thenReturn(listStudents);
	    List<Student> result = studentController.readStudents();
	    
	    //assert
	    System.out.println("StudentControllerTest || readStudents result[=> getEmail + size] :" + result.get(0).getEmail()+ " " + result.size());
	    
	    assertTrue(result.get(0).getEmail() =="eddy@gmail.com");    
	    assertTrue(2==result.size());
        
    }	
    
    

    
 
}
