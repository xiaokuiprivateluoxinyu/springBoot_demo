package com.luo.demo;

import com.luo.demo.domain.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
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
        SoftReference<Byte[]> softReference = new SoftReference<>(new Byte[1024 * 1024 * 10]);
        String a = "qqq";
        switch (a) {
            case "qqq":
                System.out.println(1);
        }
    }

    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);

        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);

        map.put("M", 1000);

        int a = 0;
        if (s.contains("IV")) {
            s = s.replace("IV", "");
            a += 4;
        }
        if (s.contains("IX")) {
            s = s.replace("IX", "");
            a += 9;
        }
        if (s.contains("XL")) {
            s = s.replace("XL", "");
            a += 40;
        }
        if (s.contains("XC")) {
            s = s.replace("XC", "");
            a += 90;
        }
        if (s.contains("CD")) {
            s = s.replace("CD", "");
            a += 400;
        }
        if (s.contains("CM")) {
            s = s.replace("CM", "");
            a += 900;
        }


        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            Character o = c[i];
            a += map.get(o.toString());
        }

        return a;
    }

    @Test
    void name12() {
        Map<String ,String > map=new HashMap();
        map.put("1","w");
        map.put("2","w");
        map.put("4","w");
        map.put("5","w");

        for (String s : map.keySet()) {
            map.put(s,"r");
        }

        System.out.println(map);

    }

    @Test
    void aaaaa() {
       int [] nums=new int[]{1,1,2,3,4,4,2,3,4,5};

        for (int i = 0; i < nums.length; i++) {

        }
    }

    @Test
    void file() {
        File file=new File("D:/api/a.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
