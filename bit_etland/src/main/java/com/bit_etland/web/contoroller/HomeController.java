package com.bit_etland.web.contoroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"ctx","css","js","img","time"})
@Controller
public class HomeController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method =RequestMethod.GET)
	public String home(HttpSession session, HttpServletRequest request) {
	System.out.println("컨트롤러진입");
	logger.info("\n --------- Welcome {} !! ----------","홈컨트롤진입");
	String ctx = request.getContextPath();
	session.setAttribute("ctx", ctx);
	session.setAttribute("css", ctx+"/resources/css/");
	session.setAttribute("js", ctx+"/resources/js/");
	session.setAttribute("img", ctx+"/resources/img/");
	session.setAttribute("time", new SimpleDateFormat("yyyy 년 MM 월 dd 일 hh:mm:ss").format(new Date()));
	
	return "home/main";
	}
}
	
	
	

























