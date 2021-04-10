/**
 * 
 */
package com.pxp.SQLite.demo.entity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test de la classe StudentEntity
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

	
	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}
	
	
   @Test
    public void testGetNomAuteur() throws Exception {
	   //given
	    Auteur auteur = mock(Auteur.class);
	    
	    //when
	    when(auteur.getNom()).thenReturn("Mathieu").thenReturn("Xavier");
	    String result = auteur.getNom() + " " + auteur.getNom();
	    
	    
	    System.out.println("AuteurRepositoryTest || findByNom result[=> findByNom + findByNom] :" + result);
	    
	    //assert	
	    assertEquals("Mathieu Xavier", result);
    }	
	
	
}
