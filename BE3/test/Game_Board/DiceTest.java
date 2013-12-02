/*
 * To change this template, choose Tools | Templates
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
 * @author Manon
 */
public class DiceTest {
    
    public DiceTest() {
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
     * Test of getNumber_of_option method, of class Dice.
     */
    @Test
    public void testGetNumber_of_option() {
        System.out.println("getNumber_of_option");
        Dice instance = null;
        int expResult = 0;
        int result = instance.getNumber_of_option();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber_of_option method, of class Dice.
     */
    @Test
    public void testSetNumber_of_option() {
        System.out.println("setNumber_of_option");
        int val_min = 0;
        int val_max = 0;
        Dice instance = null;
        instance.setNumber_of_option(val_min, val_max);
    }
}