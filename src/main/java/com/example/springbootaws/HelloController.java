package com.example.springbootaws;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello/{name}")
    public String helloDocker(@PathVariable(value = "name") String name) {
        String response = "<html><body>Hello::: <b>" + name + "</b><br/><br/>Response received on : " + new Date() + "</body></html>";
        System.out.println(response);
        return response;
 
    }
}
