/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_Board;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teddy.delavallee
 */
public class Game_PieceTest {
    
    public Game_PieceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCoordinates method, of class Game_Piece.
     */
    @Test
    public void testGetCoordinates() {
        System.out.println("getCoordinates");
        Game_Piece instance = null;
        Box expResult = null;
        Box result = instance.getCoordinates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoordinates method, of class Game_Piece.
     */
    @Test
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        Box aCoordinates = null;
        Game_Piece instance = null;
        instance.setCoordinates(aCoordinates);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAlive method, of class Game_Piece.
     */
    @Test
    public void testSetIsAlive() {
        System.out.println("setIsAlive");
        Game_Piece instance = null;
        instance.setIsAlive();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCouleur method, of class Game_Piece.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Game_Piece instance = null;
        Color expResult = null;
        Color result = instance.getCouleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class Game_Piece.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Color aCouleur = null;
        Game_Piece instance = null;
        instance.setCouleur(aCouleur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Game_Piece.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Game_Piece instance = null;
        Player expResult = null;
        Player result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Game_Piece.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Player aName = null;
        Game_Piece instance = null;
        instance.setName(aName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Game_Piece.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Game_Piece instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
