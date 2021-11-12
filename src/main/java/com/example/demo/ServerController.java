package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServerController {
	ServerController(){
		System.out.println("it calling...");
	}
//http://localhost:8080/index/?name=arun@age=18&city=salem
     @RequestMapping("index")
	public ModelAndView call()
	{
    
    	 ModelAndView mv=new  ModelAndView ();
    	 mv.setViewName("index");
    	 //System.out.println("calling");
    	 return mv ;
	}
}
