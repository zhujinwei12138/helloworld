package com.example.helloworld;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FileName:CoExample
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 14:31:23
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class CoExample {
    private String name;
    private int age;
    private List<String> address;
}
