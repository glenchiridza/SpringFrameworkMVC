package com.glencconnect.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by glenc on Jan 2021
 **/
@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting (Map<String, Object> model){
        model.put("message","Hello Glen");
        return "greeting";
    }

//    @GetMapping("thyme")
//    public String thyme (Map<String, Object> model){
//        model.put("message","Hello with thyme leaf");
//        return "thyme";
//    }

}
