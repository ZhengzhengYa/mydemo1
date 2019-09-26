package com.zz.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class zhuceController {

    @RequestMapping("/zhuye.html")
    public String zhuye(){ return "zhuye"; }

    @RequestMapping("/show.html")
    public String show(){ return "show"; }
}
