package net.bolero.epo.strutsspring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginSelectRoleController {
	
	@RequestMapping("/loginSelectRole")
	public ModelAndView getRoles(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("-----Spring Controller-----");
		
		HttpSession session = request.getSession();
		LoginForm loginForm = (LoginForm) session.getAttribute("loginForm");
		
		System.out.println("Is Login Form Present on Session? " + !(loginForm == null));
		if (loginForm != null) {
			System.out.println("Username, Password from session: " + loginForm.getUsername() + ", " + loginForm.getPassword());
		}
		
		// nothing will be shown for the moment
		return null;
		
	}
}
