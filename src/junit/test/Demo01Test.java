package junit.test;

import junit.Demo01;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo01Test {

    @Before
    public void init(){
        System.out.println("开始执行");
    }

    @After
    public void close(){
        System.out.println("结束执行");
    }

    @Test
    public void testAdd(){
        Demo01 d = new Demo01();
        int s = d.add(1,3);

        //断言 ， 期望 2， 实际 4
        Assert.assertEquals(2, s);
    }
}
