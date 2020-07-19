package com.example.demo.controller;

import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("test")
    public Demo test(@RequestBody Demo demo) {
        return demoService.getEntity(demo);
    }

    @PostMapping("test2")
    public Demo test2(@RequestBody Demo demo) {
        return demoService.getEntity2(demo);
    }

    @PostMapping("test3")
    public Demo test3(@RequestBody Demo demo) {
        return demoService.getEntity3(demo);
    }
}