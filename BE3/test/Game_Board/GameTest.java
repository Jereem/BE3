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
 * @author jeremygillet
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of getRules method, of class Game.
     */
    @Test
    public void testGetRules() {
        System.out.println("getRules");
        Game instance = null;
        String expResult = "";
        String result = instance.getRules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRules method, of class Game.
     */
    @Test
    public void testSetRules() {
        System.out.println("setRules");
        String aRules = "";
        Game instance = null;
        instance.setRules(aRules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoard method, of class Game.
     */
    @Test
    public void testGetBoard() {
        System.out.println("getBoard");
        Game instance = null;
        Board expResult = null;
        Board result = instance.getBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoard method, of class Game.
     */
    @Test
    public void testSetBoard() {
        System.out.println("setBoard");
        Board aBoard = null;
        Game instance = null;
        instance.setBoard(aBoard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
