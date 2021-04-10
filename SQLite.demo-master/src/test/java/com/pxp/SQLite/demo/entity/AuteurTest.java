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
 * Test de la classe Auteur
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuteurTest {

	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}	
	
	
    @Test
    public void getNomAuteur() throws Exception {
    	
    	//given
	    Auteur auteur = mock(Auteur.class);
	    
	    //when
	    when(auteur.getNom()).thenReturn("Mathieu").thenReturn("Xavier");
	    String result = auteur.getNom() + " " + auteur.getNom();
	    
	    //print
	    System.out.println("AuteurTest || getNomAuteur result[=> getNom + getNom] :" + result);
	    
	    //verify
	    assertEquals("Mathieu Xavier", result);
    }
	
}
