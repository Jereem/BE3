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
public class CheckerBoxTest {
    
    public CheckerBoxTest() {
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
     * Test of getLine method, of class CheckerBox.
     */
    @Test
    public void testGetLine() {
        System.out.println("getLine");
        CheckerBox instance = new CheckerBox();
        int expResult = 0;
        int result = instance.getLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class CheckerBox.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        CheckerBox instance = new CheckerBox();
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLine method, of class CheckerBox.
     */
    @Test
    public void testSetLine() {
        System.out.println("setLine");
        int aPLine = 0;
        CheckerBox instance = new CheckerBox();
        instance.setLine(aPLine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumn method, of class CheckerBox.
     */
    @Test
    public void testSetColumn() {
        System.out.println("setColumn");
        int aPColumn = 0;
        CheckerBox instance = new CheckerBox();
        instance.setColumn(aPColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCouleur method, of class CheckerBox.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        CheckerBox instance = new CheckerBox();
        Color expResult = null;
        Color result = instance.getCouleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class CheckerBox.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Color aPCouleur = null;
        CheckerBox instance = new CheckerBox();
        instance.setCouleur(aPCouleur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putBox method, of class CheckerBox.
     */
    @Test
    public void testPutBox() {
        System.out.println("putBox");
        CheckerBox instance = new CheckerBox();
        instance.putBox();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
