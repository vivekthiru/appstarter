package com.test.controller;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.test.helper.StockHelper;
import com.test.model.Stock;

@Controller
@EnableWebMvc
public class HelloController{
   
   @CrossOrigin(origins = "http://localhost:8080")
   @RequestMapping(value="/starter",headers="Accept=*/*", method=RequestMethod.GET,produces="application/json")
   public @ResponseBody Map starter() throws InterruptedException {
       System.out.println("==== in starter ====");
       StockHelper eh = new StockHelper();
      // Thread.currentThread().sleep(10000);
       return eh.populateStock();
   }
   
   
   @RequestMapping(value="/",method = RequestMethod.GET)
   public ModelAndView begin() {
       System.out.println("==== in begin ====");
       return new ModelAndView("/html/framework.html", "command", null); 
   }
   
 
   
   
   
/*   @RequestMapping(value="/student", method = RequestMethod.GET)
   public ModelAndView student() {
	   		Student st = new Student();
	   		st.setAge(22);
	      return new ModelAndView("student.jsp", "command", st);
   }
   
   @RequestMapping(value="/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute Student student, 
		   ModelMap model) {
	      model.addAttribute("name", student.getName());
	      model.addAttribute("age", student.getAge());
	      model.addAttribute("id", student.getId());
	      
	      return "result";
   }*/
}