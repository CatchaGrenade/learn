package com.kaung;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kaung.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Sb04RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("myKey", "csq哈哈哈");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
    }

    @Test
    public void test1() throws JsonProcessingException {
        User u = new User("csq", 22);
//        String jsonUser = new ObjectMapper().writeValueAsString(u);
        redisTemplate.opsForValue().set("info", u);
        System.out.println(redisTemplate.opsForValue().get("info"));
    }

}
