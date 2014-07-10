/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author y.voytovich
 */
public class MilitaryBaseTest {
    
    public MilitaryBaseTest() {
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
     * Test of rideCar method, of class MilitaryBase.
     */
    @Test
    public void testRideCar_0args() {
        System.out.println("rideCar");
        MilitaryBase instance = new MilitaryBase();
        instance.rideCar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rideCar method, of class MilitaryBase.
     */
    @Test
    public void testRideCar_int() {
        System.out.println("rideCar");
        int requiredSpeed = 0;
        MilitaryBase instance = new MilitaryBase();
        instance.rideCar(requiredSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar method, of class MilitaryBase.
     */
    @Test
    public void testSetCar() {
        System.out.println("setCar");
        Car car = null;
        MilitaryBase instance = new MilitaryBase();
        instance.setCar(car);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MilitaryBase.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MilitaryBase.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
