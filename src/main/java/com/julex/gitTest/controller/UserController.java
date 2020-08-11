package com.julex.gitTest.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "test")
    public JSONObject test() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "yang");
        return jsonObject;
    }
}
