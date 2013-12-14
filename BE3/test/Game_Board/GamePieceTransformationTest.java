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
public class GamePieceTransformationTest {
    
    public GamePieceTransformationTest() {
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
     * Test of transformation method, of class GamePieceTransformation.
     */
    @Test
    public void testTransformation() {
        System.out.println("transformation");
        Game_Piece p = null;
        GamePieceTransformation instance = new GamePieceTransformationImpl();
        instance.transformation(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GamePieceTransformationImpl implements GamePieceTransformation {

        public void transformation(Game_Piece p) {
        }
    }
    
}
