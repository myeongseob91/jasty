package com.jasty.join.controller;

import com.jasty.join.model.Users;
import com.jasty.join.service.JoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping(value="/join")
public class JoinController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JoinService joinService;

    @RequestMapping(value="/join.do")
    public String join(Users users){

        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");

        //System.out.println(users);
        joinService.joinService(users);
        return "timeLine";
    }


}