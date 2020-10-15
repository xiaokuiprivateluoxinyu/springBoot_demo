package com.luo.demo;

import com.luo.demo.domain.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {

        System.out.println(person);
        Class clazz = Class.forName("com.luo.demo.domain.Person");
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(person));

    }

    @Test
    void name() {
        HashMap<String,String> map=new HashMap();
        map.put("1","2");
        /*String a=map.put("1","3");
        System.out.println(a);*/
        map.put("1","3");
        System.out.println(map.get("1"));
        System.out.println("2323");
    }
}
