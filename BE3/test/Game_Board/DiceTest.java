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
 * @author jeremygillet
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
        Dice instance = new Dice();
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
        int aNumber_of_option = 0;
        Dice instance = new Dice();
        instance.setNumber_of_option(aNumber_of_option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
