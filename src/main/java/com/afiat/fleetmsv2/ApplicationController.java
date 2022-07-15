package com.afiat.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/index")
    public String home(){
        return "index";
    }

    @RequestMapping("login")
    public String login(){
        return "pages-login";
    }
}
