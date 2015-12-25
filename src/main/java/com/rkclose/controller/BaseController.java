package com.rkclose.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "/index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@ResponseBody
	public String indexPage(ModelMap model, @RequestParam( defaultValue = "") String playerGuess) {
		logger.debug("The  playerGuess in the business end is: " + playerGuess);
		model.addAttribute("results", "This is where the results will be returned");
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}
}