package com.example.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * FileName:propertTest
 * Author:zhujinwei
 * Date: 2021年11月16日 13:50:41
 * Description: propertTest
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    @Value("${age}")
    private int age;
    @Value("${name}")
    private String name;
    @Test
    public void getAge()
    {
        System.out.println(age);
    }
    @Test
    public void getName()
    {
        System.out.println(name);
    }
    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;
   // @Test
    public void getpersonproperties()
    {
        System.out.println(getPersonInfoProperties.getName()+"\n"+getPersonInfoProperties.getAge());
    }

}
