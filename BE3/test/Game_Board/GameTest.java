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
        Game instance = new GameImpl();
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
        Game instance = new GameImpl();
        instance.setRules(aRules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putGame method, of class Game.
     */
    @Test
    public void testPutGame() {
        System.out.println("putGame");
        Game instance = new GameImpl();
        instance.putGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameImpl extends Game {
    }
    
}
