package com.luo.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @date:2020-09-25
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private Integer age;
    private String name;
    private Date birthday;
    private Map<String,String> map;
    private List<Integer> list;
    private int a;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
