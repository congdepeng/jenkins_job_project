package com.depeng;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    private Math math;

    @Before
    public void setUp() throws Exception {
         math = new Math();
    }

    @After
    public void tearDown() throws Exception {
        math = null;
    }

    @Test
    public void testAdd() throws Exception {

        int add = math.add(1, 2);
        Assert.assertEquals(add,3);

    }

    @Test
    public void testMinus() throws Exception {
        Assert.assertEquals(math.minus(1,2),-1);
    }
}
