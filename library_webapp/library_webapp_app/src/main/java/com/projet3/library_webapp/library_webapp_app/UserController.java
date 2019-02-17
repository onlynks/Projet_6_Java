package com.projet3.library_webapp.library_webapp_app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet3.library_webapp.library_webapp_model.user.User;

@Controller
public class UserController extends AbstractUserController{
	
	@RequestMapping("/logIn")
	public String logIn(@RequestParam("firstName") String firstName,
						@RequestParam("lastName") String lastName,
						@RequestParam("password") String password,
						HttpServletRequest request,
						Model model) {
		
		
		HttpSession session = request.getSession();
		try {	
			User user = userManager.logIn(firstName, lastName, password);
	        session.setAttribute("user", user);	
			return "index";
			
		} catch(Exception e) {
			model.addAttribute("error", "Erreur lors de l'authentification");
			return "index";
		}
				
	}
	
	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession(true); 
		session.invalidate();
		
		return "index";		
	}

}
