package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {




    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view_for_hr";
    }

    @GetMapping("manager_info")
    public String getInfoOnlyForManager(){
        return "view_for_manager";
    }
}
