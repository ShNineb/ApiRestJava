/**
 * 
 */
package com.pxp.SQLite.demo.controller;

import java.util.List;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import com.pxp.SQLite.demo.entity.Auteur;
import java.util.ArrayList;
//import org.junit.Test;
import org.junit.jupiter.api.Test;


/**
 * Test du controller AuteurController
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuteurControllerTest {

	  	  
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
	    public void testGetAuteur() throws Exception {
	    	
		    //given	
		    AuteurController auteurController = mock(AuteurController.class);
		    
	        Auteur auteur1 = new Auteur();
	        auteur1.setNom("Khalil Gibran");
	        Auteur auteur2 = new Auteur();
	        auteur2.setNom("Céline Proust");
	        Auteur auteur3 = new Auteur();
	        auteur3.setNom("Victor Hugo");
	        
	        List<Auteur> auteurList = new ArrayList<Auteur>();
	        
	        auteurList.add(auteur1);
	        auteurList.add(auteur2);
	        auteurList.add(auteur3);
	     
		    //when
		    when(auteurController.getAuteurs()).thenReturn(auteurList);
		    List<Auteur> result = auteurController.getAuteurs();
		    
		    System.out.println("AuteurController || testGetAuteur result[=> getNom] :" + result.get(0).getNom());
		    //verify
		    assertEquals(result.size(),3);
	    
	    }    
	    
	    
	    
	    
	    
	
}
