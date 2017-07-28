/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nagendram
 */
public class PracticeTest {
    
    public PracticeTest() {
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
     * Test of main method, of class Practice.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Practice.main(args);
    }

    /**
     * Test of add method, of class Practice.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i1 = 10;
        int i2 = 0;
        Practice instance = new Practice();
        int expResult = 10;
        int result = instance.add(i1, i2);
        assertEquals(expResult, result);
    }
    
}
