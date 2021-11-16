package com.example.helloworld;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * FileName:GetPersonInfoProperties
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 13:59:16
 */
@Setter
@Getter

@Component
@ConfigurationProperties(prefix = "personinfo")
public class GetPersonInfoProperties {
private String name;
private int age;
}
