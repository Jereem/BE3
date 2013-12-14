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
public class SnakesAndLaddersPlayerTest {
    
    public SnakesAndLaddersPlayerTest() {
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
     * Test of getMyGamePiece method, of class SnakesAndLaddersPlayer.
     */
    @Test
    public void testGetMyGamePiece() {
        System.out.println("getMyGamePiece");
        SnakesAndLaddersPlayer instance = new SnakesAndLaddersPlayer();
        Game_Piece expResult = null;
        Game_Piece result = instance.getMyGamePiece();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
