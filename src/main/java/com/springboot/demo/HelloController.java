package com.springboot.demo;

import com.springboot.demo.mapper.TestMapper;
import com.springboot.demo.model.TestDO;
import com.springboot.demo.publish.MyEventPublish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MyEventPublish myEventPublish;

    @Autowired
    private TestMapper testMapper;

    @GetMapping("publish")
    public void publish(@RequestParam("name") String name) {
        myEventPublish.publishCustomEvent(name);
    }

    @GetMapping("h2-test")
    public int h2Test(@RequestParam("id")Integer id, @RequestParam("name")String name) {
        TestDO testDO = new TestDO();
        testDO.setId(id);
        testDO.setName(name);
        return testMapper.insert(testDO);
    }

}
