package com.darahasa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void thisTestShouldPass() {
        System.out.println("TEST EXECUTED - PASS");
        Assert.assertEquals(2 + 2, 4);
    }
    //@Test
    //public void thisTestShouldFail() {
        //System.out.println("TEST EXECUTED - FAIL");
        //Assert.assertEquals(2 + 2, 5);
    //}

    
}
