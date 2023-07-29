package com.pwright.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	// Log in
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {

		return "login";
	}

	// Welcome Page (after hitting submit on login)
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		model.put("name", name);
		
		if (authenticationService.authenticate(name, password)) {
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		
		return "login";
	}

}
