package com.glencconnect.conference.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by glenc on Jan 2021
 **/
@RestController
public class ErrorHandlerController implements ErrorController {

    @Override
    @RequestMapping("/error")
    @ResponseBody
    public String getErrorPath() {
        return "<center><h1>Something went wrong</h1></center>";

    }
}