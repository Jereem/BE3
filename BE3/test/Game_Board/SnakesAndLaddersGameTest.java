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
public class SnakesAndLaddersGameTest {
    
    public SnakesAndLaddersGameTest() {
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
     * Test of play method, of class SnakesAndLaddersGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        SnakesAndLaddersGame instance = new SnakesAndLaddersGame();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putGame method, of class SnakesAndLaddersGame.
     */
    @Test
    public void testPutGame() {
        System.out.println("putGame");
        SnakesAndLaddersGame instance = new SnakesAndLaddersGame();
        instance.putGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
