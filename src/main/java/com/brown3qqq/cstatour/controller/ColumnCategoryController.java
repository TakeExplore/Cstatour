package com.brown3qqq.cstatour.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColumnCategoryController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "hello world!　烦人的世界, 热更新测试";
    }
}
