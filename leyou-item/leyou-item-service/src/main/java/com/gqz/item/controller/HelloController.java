package com.gqz.item.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2022-04-19 15:41
 **/
@RequestMapping
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
