/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.circleci2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author godswill
 */
public class CircleTestTest {
    
    public CircleTestTest() {
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
     * Test of sum method, of class CircleTest.
     */
     @Test
    public void testSum() {
        System.out.println("sum");
        int n = 10;
        int y = 12;
        CircleTest instance = new CircleTest();
        int expResult = 22;
        int result = instance.sum(n, y);
        System.out.println(result + "    " + expResult);
        org.junit.Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
       @Test
    public void testMulti() {
        System.out.println("multi");
     //   int m=0;
        int n=7; int y=3;
        CircleTest instance = new CircleTest();
      //  int expResult = 23;
        instance.multi(n, y);
        System.out.println("m="+instance.m);
        org.junit.Assert.assertEquals(instance.m, 21);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
           @Test
    public void testMultiWhenValueLessthan0() {
        System.out.println("multi");
 
        int n=-7; int y=3;
        CircleTest instance = new CircleTest();
   
        instance.multi(n, y);
        System.out.println("m="+instance.m);
        org.junit.Assert.assertEquals(instance.m, 0);
     }
    
        
    @Test
    public void testMultix() {
        System.out.println("multi");
 
        int n=-7; int y=3;
        CircleTest instance = new CircleTest();
   
        try{
        instance.multix(n, y);
        fail("there is a problem cos we expect an exception");
        }
        catch(Exception e){
        System.out.println("good. we expect an exception");
        }
        //+919923195575
     }
   
}
