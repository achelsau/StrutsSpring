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
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		getSpringBeans(request);
		if (username == null && password == null) {
			return mapping.findForward("input");
		} else {
			HttpSession session = request.getSession(true);
			LoginForm loginForm = new LoginForm();
			loginForm.setUsername(username);
			loginForm.setPassword(password);
			session.setAttribute("loginForm", loginForm);
			return mapping.findForward("credentialsEntered");
		}
	}
	
	private void getSpringBeans(HttpServletRequest request) {
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
        UserBO mgr = (UserBO) ctx.getBean("userBO");
	}
}
