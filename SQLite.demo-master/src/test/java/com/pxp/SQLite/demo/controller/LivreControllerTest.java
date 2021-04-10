/**
 * 
 */
package com.pxp.SQLite.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pxp.SQLite.demo.entity.Auteur;
import com.pxp.SQLite.demo.entity.Livre;

/**
 * Test du controller:  LivreController
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LivreControllerTest {

	
	@org.junit.jupiter.api.BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@org.junit.jupiter.api.AfterEach
	public void after() {
		System.out.println("After");
	}
	
    @Test
    public void getLivresTest()  throws Exception  {
    	
    	//given
    	LivreController livreController = mock(LivreController.class);
    	
        Auteur auteur1 = new Auteur();
        auteur1.setNom("StExupery");
        Auteur auteur2 = new Auteur();
        auteur2.setNom("MarcLevy");
        
     	Livre livre1 = new Livre(auteur1, "titre1");
    	Livre livre2 = new Livre( auteur2,"titre2");       
        
    	List<Livre> listLivres = new ArrayList<Livre>();
    	listLivres.add(livre1);
    	listLivres.add(livre2);
    	
    	//when
    	when(livreController.getLivres()).thenReturn(listLivres);
    	
        // test
        List<Livre> result = livreController.getLivres();       

	    System.out.println("LivreControllerTest || getLivresTest result[=> getAuteur().getNom() + size] :" + result.get(1).getAuteur().getNom()+ " " + result.size());
	    
	    //assert    	
	    assertTrue(result.get(1).getAuteur().getNom() == "MarcLevy");  
        assertEquals(2, result.size());  
    }
}
