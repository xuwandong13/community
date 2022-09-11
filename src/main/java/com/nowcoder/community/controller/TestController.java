package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xuwandong
 * @date ：Created in 2022/9/7 22:55
 * @description：
 * @modified By：
 */
@Controller
@RequestMapping("/a")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
