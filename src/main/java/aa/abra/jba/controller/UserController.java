package aa.abra.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aa.abra.jba.service.UserService;

@Controller

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
		public String users(Model model){
		model.addAttribute("users", userService.findAll());
		return "users";
	}

}
