package com.springboot.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

        @GetMapping("/")
        public String Index(){return "Index";}
        @GetMapping("/error")
        public  String eroor(@RequestParam(name = "error",required = false) String error,Model model){
            model.addAttribute("error",error);
            return  "error";
        }
}
