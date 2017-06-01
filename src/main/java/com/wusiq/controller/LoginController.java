package com.wusiq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器
 */
@Controller
@RequestMapping("loginController")
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/welcome.do",method = RequestMethod.GET)
    public String doWelcome(){
        log.info("login successed");
        return "welcomePage";
    }
}
