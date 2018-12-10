package com.example.birthday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: wangchengdong
 * @date: 2018/12/7 15:24
 * @description:
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "SUCCESS!!!";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
