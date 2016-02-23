package com.test.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.test.helper.EmployeeHelper;
import com.test.model.Student;

@Controller
@EnableWebMvc
public class CommonController{
   

   
   @RequestMapping(value="/footer",method = RequestMethod.GET)
   public ModelAndView footer() {
       System.out.println("==== in footer ====");
       return new ModelAndView("footer.jsp", "command", null); 
   }
   
   @RequestMapping(value="/header",method = RequestMethod.GET)
   public ModelAndView header() {
       System.out.println("==== in header ====");
       return new ModelAndView("header.jsp", "command", null); 
   }

   
   @RequestMapping(value="/link",method = RequestMethod.GET)
   public ModelAndView doFramework(@RequestParam("url") String url) {
       System.out.println("==== in framework ====" + url);
       return new ModelAndView(url+".jsp", "command", null); 
   }



   
   
}