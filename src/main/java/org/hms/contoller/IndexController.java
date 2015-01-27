package org.hms.contoller;


import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.LoggerFactory;

@Controller
public class IndexController {
	
	private static final Logger logger=LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/")
	public String indexController(){
		logger.info("IndexController Method called");
		return "index";
	}
}
