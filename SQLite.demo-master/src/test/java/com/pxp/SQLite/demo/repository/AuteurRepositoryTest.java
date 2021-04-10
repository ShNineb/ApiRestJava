/**
 * 
 */
package com.pxp.SQLite.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pxp.SQLite.demo.entity.Auteur;

/**
 * Test du Repository AuteurRepository
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuteurRepositoryTest {

	
	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}
	

    
    @Test
    public void findByNom() throws Exception {
    	
    	//given
	    AuteurRepository auteurRepository = mock(AuteurRepository.class);
	    
	    //when
	    when(auteurRepository.findByNom()).thenReturn("Mathieu").thenReturn("Xavier");
	    String result = auteurRepository.findByNom() + " " + auteurRepository.findByNom();
	    
	    //print
	    System.out.println("AuteurRepositoryTest || findByNom result[=> findByNom + findByNom] :" + result);
	    
	    //verify    
	    assertEquals("Mathieu Xavier", result);
    }
    
}
