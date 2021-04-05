package it.fp.scalzagallo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScalzagalloController {
		
				@RequestMapping(value="/", method = RequestMethod.GET)
				public String home(Model model) {
					
					return "home";
					
				}
				
				@RequestMapping(value="/start", method = RequestMethod.GET)
				public String start(Model model) {
					
					return "start";
					
				}
				
				@RequestMapping(value="/nope", method = RequestMethod.GET)
				public String nope(Model model) {
					
					return "nope";
					
				}

}
