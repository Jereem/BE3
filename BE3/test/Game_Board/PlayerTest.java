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
 * @author jeremygillet
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player();
        String expResult = "jeje";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String aAttribute = "";
        Player instance = new Player();
        instance.setName(aAttribute);
        assertEquals(aAttribute, instance.getName());
        
    }

    /**
     * Test of getColor method, of class Player.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Player instance = new Player();
        Color expResult = Color.BLACK;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setColor method, of class Player.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color aColor = null;
        Player instance = new Player();
        instance.setColor(aColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinning_counter method, of class Player.
     */
    @Test
    public void testGetWinning_counter() {
        System.out.println("getWinning_counter");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getWinning_counter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWinning_counter method, of class Player.
     */
    @Test
    public void testSetWinning_counter() {
        System.out.println("setWinning_counter");
        int aWinning_counter = 0;
        Player instance = new Player();
        instance.setWinning_counter(aWinning_counter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
