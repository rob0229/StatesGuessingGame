package com.rkclose.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rkclose.StatesGame;


@Controller
public class BaseController {
	StatesGame statesGame;
	
	private static int counter = 0;
	private static final String VIEW_INDEX = "/index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@ResponseBody
	public String indexPage(ModelMap model, @RequestParam(defaultValue = "") String playerGuess) {
		statesGame = statesGame.getInstance(); 

		int guessResult = -1;
		if(statesGame != null && playerGuess != "" && playerGuess != null){
			logger.error("Player guess is: " + playerGuess);
			logger.error("statesGame is: " + statesGame);
			guessResult = statesGame.getDistance(playerGuess);
			model.addAttribute("results", guessResult);
		}
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}
}