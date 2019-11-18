package com.springboot.manager.controller;

import com.springboot.manager.dto.PublishDto;
import com.springboot.manager.mapper.PublishMapper;
import com.springboot.manager.mapper.UserMapper;
import com.springboot.manager.model.Publish;
import com.springboot.manager.model.User;
import com.springboot.manager.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

        @Autowired
        private UserMapper userMapper;

        @Autowired
        private PublishService publishService;

        @GetMapping("/")
        public String Index(HttpServletRequest request,Model model){
            Cookie[] cookies = request.getCookies();
            if (cookies!=null && cookies.length!=0) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("token")) {
                        String token = cookie.getValue();
                        User user = userMapper.findUserByToken(token);
                        if (user != null) {
                            request.getSession().setAttribute("user", user);
                            break;
                        }
                    }
                }
            }
            //从数据库查出publish表所有数据
            List<PublishDto> publishList = publishService.list();
            for (PublishDto publishDto : publishList) {
                publishDto.setDescription("22222");
            }
            //将查出的数据集合传到前端
            model.addAttribute("publishes",publishList);
            return "Index";
        }
        @GetMapping("/error")
        public  String error(@RequestParam(name = "error",required = false) String error,Model model){
            model.addAttribute("error",error);
            return  "error";
        }

}
