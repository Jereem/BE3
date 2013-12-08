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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of getNbBox method, of class Board.
     */
    @Test
    public void testGetNbBox() {
        System.out.println("getNbBox");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getNbBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNbBox method, of class Board.
     */
    @Test
    public void testSetNbBox() {
        System.out.println("setNbBox");
        int pNbBox = 22;
        Board instance = new Board();
        instance.setNbBox(pNbBox);
        int result = instance.getNbBox();
        assertEquals(pNbBox, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Board instance = new Board();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
