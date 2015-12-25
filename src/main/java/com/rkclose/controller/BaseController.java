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
	private static final String VIEW_PLAYGAME = "/StatesGuessingGame/playGame.html";
	private static final String VIEW_GUESSINGGAME_HOME = "/StatesGuessingGame/GuessingGame.html";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value = "/playGame", method = RequestMethod.GET)
	public String playGame(ModelMap model) {
		logger.debug("made it to the playgame page");
		 model.addAttribute("results", "You are piss warm");
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_PLAYGAME;
		
	}
	
	@RequestMapping(value = "/GuessingGame", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_GUESSINGGAME_HOME;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@ResponseBody
	public String indexPage(ModelMap model, @RequestParam( defaultValue = "") String playerGuess) {
		logger.debug("The  playerGuess in the business end is: " + playerGuess);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}

	/*@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName]: {}, counter : {}", name, counter);
		return VIEW_INDEX;
	}*/

//	@RequestMapping(value = "/playGame", method = RequestMethod.GET)
//	public String playGame(ModelMap model) {
//
//		logger.debug("Changing Page to playGame.jsp");
//		//
//		return VIEW_PLAYGAME;
//	}

}