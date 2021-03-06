package net.bolero.epo.strutsspring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Component;

@Component
public class LoginSelectRoleAction extends Action {
	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		LoginForm loginForm = (LoginForm) session.getAttribute("loginForm");
		if (loginForm.getUsername() != null && loginForm.getUsername().equals("test")
				&& loginForm.getPassword() != null && loginForm.getPassword().equals("test")) {
			return mapping.findForward("input");
		}
		return mapping.findForward("error");
	}
}
