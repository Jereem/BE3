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
public class Agressive_Game_PieceTest {
    
    public Agressive_Game_PieceTest() {
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
     * Test of attack method, of class Agressive_Game_Piece.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Game_Piece p1 = null;
        Game_Piece p2 = null;
        Box aBox_b = null;
        Agressive_Game_Piece instance = null;
        instance.attack(p1, p2, aBox_b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmAttack method, of class Agressive_Game_Piece.
     */
    @Test
    public void testConfirmAttack() {
        System.out.println("confirmAttack");
        Game_Piece p1 = null;
        Game_Piece p2 = null;
        Agressive_Game_Piece instance = null;
        boolean expResult = false;
        boolean result = instance.confirmAttack(p1, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
