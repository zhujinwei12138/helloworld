package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.beans.Transient;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() throws Exception
    {
        String json= "{\n" +
                "  \"number\": [\n" +
                "    {\"name\": \"sb\",\"message\": \"2b\"},\n" +
                "    {\"name\": \"dsb\",\"message\": \"d2b\"}" +
                "]\n" +
                "}";
        return json;

       // return "Hello World";
    }



}
