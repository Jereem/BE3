/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_Board;

import java.awt.Color;
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
    public void testGetPath() {
        System.out.println("getPath");
        LineBoard instance = new LineBoard();
        LineBox[] expResult = null;
        LineBox[] result = instance.getPath();
        //assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putBoard method, of class LineBoard.
     */
    @Test
    public void testPutBoard() {
        System.out.println("putBoard");
        LineBox instance1 = new LineBox();
        Board uB = null;
        Game_Piece pPiece = new Game_Piece(instance1, true , Color.BLUE , "Ted", uB);
        SnakesAndLaddersBoard instance = new SnakesAndLaddersBoard();
        instance.putBoard();
        int n = 5;
        instance.getPath(n).addGamePiece(pPiece);
        instance.putBoard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
