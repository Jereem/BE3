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
public class LineBoxTest {
    
    public LineBoxTest() {
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
     * Test of getIndex method, of class LineBox.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        LineBox instance = new LineBox();
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIndex method, of class LineBox.
     */
    @Test
    public void testSetIndex() {
        System.out.println("setIndex");
        int pIndex = 0;
        LineBox instance = new LineBox();
        instance.setIndex(pIndex);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMouvement method, of class LineBox.
     */
    @Test
    public void testGetMouvement() {
        System.out.println("getMouvement");
        LineBox instance = new LineBox();
        int expResult = 0;
        int result = instance.getMouvement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMouvement method, of class LineBox.
     */
    @Test
    public void testSetMouvement() {
        System.out.println("setMouvement");
        int pMouvement = 0;
        LineBox instance = new LineBox();
        instance.setMouvement(pMouvement);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putBox method, of class LineBox.
     */
    @Test
    public void testPutBox() {
        System.out.println("putBox");
        LineBox instance = new LineBox();
        Board uB = null;
        Game_Piece pPiece = new Game_Piece(instance, true , Color.BLUE , "Ted", uB);
        instance.addGamePiece(pPiece);
        instance.putBox();
    }
    
}
