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
public class CheckerBoardTest {
    
    public CheckerBoardTest() {
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
     * Test of toString method, of class CheckerBoard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CheckerBoard instance = new CheckerBoard(2);
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putBoard method, of class CheckerBoard.
     */
    @Test
    public void testPutBoard() {
        System.out.println("putBoard");
        CheckerBoard instance = new CheckerBoard(2);
        instance.putBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putBoard method, of class CheckerBoard.
     */
    @Test
    public void testPutBoard() {
        System.out.println("putBoard");
        CheckerBoard instance = null;
        instance.putBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
