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
public class LineBoardTest {
    
    public LineBoardTest() {
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
     * Test of getPath method, of class LineBoard.
     */
    @Test
    public void testGetPath_0args() {
        System.out.println("getPath");
        LineBoard instance = new LineBoard();
        LineBox[] expResult = null;
        LineBox[] result = instance.getPath();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class LineBoard.
     */
    @Test
    public void testGetPath_int() {
        System.out.println("getPath");
        int n = 0;
        LineBoard instance = new LineBoard();
        LineBox expResult = null;
        LineBox result = instance.getPath(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putBoard method, of class LineBoard.
     */
    @Test
    public void testPutBoard() {
        System.out.println("putBoard");
        LineBoard instance = new LineBoard();
        instance.putBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
