package com.letao;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

//@SpringBootTest
class LetaoApplicationTests {

    @Test
    void contextLoads() {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.get("id"));
        //Long id = Long.valueOf(map.get("id"));
        //System.out.println(id);
    }

}
