package com.example.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:MultiYmlDemoApplicationTest
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 14:43:48
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MultiYmlDemoApplicationTest {
    @Value("${myenvironment.name}")
    private String name;
    @Test
    public void getMyEnvironment()
    {
        System.out.println(name);
    }
}
