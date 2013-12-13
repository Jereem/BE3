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
 * @author Djo
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
     * Test of getListMovement method, of class Mobile_Game_Piece.
     */
    @Test
    public void testGetListMovement() {
        System.out.println("getListMovement");
        Mobile_Game_Piece instance = null;
        Enum expResult = null;
        Enum result = instance.getListMovement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListMovement method, of class Mobile_Game_Piece.
     */
    @Test
    public void testSetListMovement() {
        System.out.println("setListMovement");
        Enum aListMovement = null;
        Mobile_Game_Piece instance = null;
        instance.setListMovement(aListMovement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Mobile_Game_Piece.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Object aGame_Piece_p = null;
        Object aListMovement_Enum = null;
        Mobile_Game_Piece instance = null;
        instance.move(aGame_Piece_p, aListMovement_Enum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
