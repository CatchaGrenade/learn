package com.kuang;

import com.kuang.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb02CfgApplicationTests {

    @Autowired
    private Person p;
    @Test
    void contextLoads() {
        System.out.println(p.getEm());
    }

}
