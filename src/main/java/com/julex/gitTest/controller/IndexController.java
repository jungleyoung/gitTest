package com.julex.gitTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Julex yangjie
 * @Date 2021/8/8 21:40
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "md")
    public String md() {
        return "demo.md";
    }

    @RequestMapping(value = "demo")
    public String demo() {
        return "demo.html";
    }
}
