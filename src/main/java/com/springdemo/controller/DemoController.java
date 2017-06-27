package com.springdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/demo")
    public String index(){
    	logger.info("RequestURI - {}", " test ");
    	
        return "demo";
    }
}
