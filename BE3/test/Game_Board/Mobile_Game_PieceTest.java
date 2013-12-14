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
public class Mobile_Game_PieceTest {
    
    public Mobile_Game_PieceTest() {
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
     * Test of setPossibility method, of class Mobile_Game_Piece.
     */
    @Test
    public void testSetPossibility() {
        System.out.println("setPossibility");
        Box[] possibility = null;
        Mobile_Game_Piece instance = null;
        instance.setPossibility(possibility);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Mobile_Game_Piece.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Mobile_Game_Piece mgp = null;
        Box b = null;
        Mobile_Game_Piece instance = null;
        instance.move(mgp, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
