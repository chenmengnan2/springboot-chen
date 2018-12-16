package com.baizhi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/con")
@RestController
public class Controller {
    @RequestMapping("/method")
    public String method(){
        return "aa";
    }
}
