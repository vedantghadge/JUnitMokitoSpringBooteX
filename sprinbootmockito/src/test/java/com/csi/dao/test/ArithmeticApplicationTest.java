package com.csi.dao.test;


import com.csi.dao.ArithmaticApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArithmeticApplicationTest {

    ArithmaticApplication arithmaticApplication = new ArithmaticApplication();


    @Test
    public void addTest() {

        Assert.assertEquals(30, arithmaticApplication.add(10, 20));
    }
    @Test
    public void subTest() {

        Assert.assertEquals(30, arithmaticApplication.sub(50, 20));
    }

}
