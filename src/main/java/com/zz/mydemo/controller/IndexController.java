package com.zz.mydemo.controller;

import com.zz.mydemo.commmon.BaseResult;
import com.zz.mydemo.model.User;
import com.zz.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/")

    public String Index(){
        return  "index";
    }


    @RequestMapping("/login.json")
    @ResponseBody
    public BaseResult recieveDate(@RequestBody Map<String, Object> loginData) {
        BaseResult baseResult =new BaseResult();
        String username = loginData.get("username").toString();
        String password = loginData.get("password").toString();
        System.out.println("username"+username+"...password..."+password);
        User user =userService.findUserName(username);
        System.out.println(user);

        if (user != null ){
         if (user.getUserpassword().equals(password)){
             baseResult.setSuccess(true);
         }else {
             baseResult.setSuccess(false);
         }
        }
        return baseResult;
    }



}



