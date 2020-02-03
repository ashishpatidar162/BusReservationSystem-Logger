package com.busreservationsystem.application.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busreservationsystem.application.logger.helpers.SpringLoggingHelper;

@Controller
@RestController
public class IndexController {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	    @RequestMapping("/index")
	    String index(){
	        logger.debug("This is a debug message Packages INDEXCONTROLLERS");
	        logger.info("This is an info message Packages INDEXCONTROLLERS");
	        logger.warn("This is a warn message Packages INDEXCONTROLLERS");
	        logger.error("This is an error message Packages INDEXCONTROLLERS");
	        new SpringLoggingHelper().helpMethod();
	        return "index Log OutPut on Console";
	    }
}
