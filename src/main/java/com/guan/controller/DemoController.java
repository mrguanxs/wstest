package com.guan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author guanxinshuai E-mail:
 * @version 创建时间：2019/11/6 2:43 PM
 * Demo:demo
 */
@Controller
public class DemoController {

    @RequestMapping("/hello")
    public String demo(){
        System.out.println("hello world!!!");
        return "index";
    }
}