/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_Board;

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
public class BoxTest {
    
    public BoxTest() {
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
     * Test of setIsBusy method, of class Box.
     */
    @Test
    public void testSetIsBusy() {
        System.out.println("setIsBusy");
        boolean p = false;
        Box instance = new Box();
        instance.setIsBusy(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsBusy method, of class Box.
     */
    @Test
    public void testGetIsBusy() {
        System.out.println("getIsBusy");
        Box instance = new Box();
        boolean expResult = false;
        boolean result = instance.getIsBusy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setIsBusy method, of class Box.
     */
    @Test
    public void testSetIsBusy() {
        System.out.println("setIsBusy");
        boolean p = true;
        Box instance = new Box();
        instance.setIsBusy(p);
        boolean expResult = true;
        boolean result = instance.getIsBusy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGamePiece method, of class Box.
     */
    @Test
    public void testAddGamePiece() {
        System.out.println("addGamePiece");
        Game_Piece pPiece = null;
        Box instance = new Box();
        instance.addGamePiece(pPiece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delGamePiece method, of class Box.
     */
    @Test
    public void testDelGamePiece_Game_Piece() {
        System.out.println("delGamePiece");
        Game_Piece pPiece = null;
        Box instance = new Box();
        instance.delGamePiece(pPiece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delGamePiece method, of class Box.
     */
    @Test
    public void testDelGamePiece_int() {
        System.out.println("delGamePiece");
        int nbPiece = 0;
        Box instance = new Box();
        instance.delGamePiece(nbPiece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putBox method, of class Box.
     */
    @Test
    public void testPutBox() {
        System.out.println("putBox");
        Box instance = new Box();
        instance.putBox();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
