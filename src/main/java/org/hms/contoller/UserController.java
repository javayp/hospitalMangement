package org.hms.contoller;

import java.util.HashSet;
import java.util.Set;

import org.hms.model.Country;
import org.hms.model.User;
import org.hms.service.CoutryService;
import org.hms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CoutryService countryService;
	
	//Dont declare countries as List,since list doesn't care about uniqueness of values
	private Set<String> countries=new HashSet<String>();
	
	@ModelAttribute("user")
	public User construct_user(){
		return new User();
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String userController(Model model){
		logger.info("User Controller called");
		model.addAttribute("user", construct_user());
		for (Country value : countryService.loadCountries()) {
			//if countries was list the value fetched from the database would be duplicated since 
			 countries.add(value.getName());
		}
		model.addAttribute("countriesList", countries);
		return "user";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String userControllerSubmission(@ModelAttribute("user") User user){
		logger.info("User ControllerSubmission called called");
		userService.save(user);
		return "user";
	}
}
