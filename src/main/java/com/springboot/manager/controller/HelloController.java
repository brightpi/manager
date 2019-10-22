package com.springboot.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

        @GetMapping("/hello")
        public String hello(@RequestParam(name = "name",required = true) String name, Model model){
            model.addAttribute("name", name);
            return "hello";
        }
        @GetMapping("/error")
        public  String eroor(@RequestParam(name = "error",required = false,value = "错误信息") String error,Model model){
            model.addAttribute("error",error);
            return  "error";
        }
}
