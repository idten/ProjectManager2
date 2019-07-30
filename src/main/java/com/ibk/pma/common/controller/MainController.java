package com.ibk.pma.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController
{
    @RequestMapping(value="/",method= RequestMethod.GET)
    public ModelAndView index(ModelAndView mav){
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping(value="/search.do",method= RequestMethod.POST)
    public ModelAndView search(ModelAndView mav){
        System.out.println("search.do Called");
        mav.setViewName("index");
        return mav;
    }

}
