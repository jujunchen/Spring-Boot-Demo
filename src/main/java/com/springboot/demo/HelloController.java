package com.springboot.demo;

import com.springboot.demo.publish.MyEventPublish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MyEventPublish myEventPublish;

    @GetMapping("index")
    public String index(@RequestParam("id") String d) {
        return "Hello World!" + d;
    }

    @GetMapping("publish")
    public void publish(@RequestParam("name") String name) {
        myEventPublish.publishCustomEvent(name);
    }

}
