package com.edureka.javasql1.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{

	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		
		// Username / password - admin
		// Success [admin] -> success
		// Failure -> failure
		
		LoginModel loginModel = (LoginModel)form;
		
		String username = loginModel.getUsername();
		String password = loginModel.getPassword();
		
		String condition = "";
		
		if (username != null && username.equals("admin") 
			&& password != null && password.equals("admin")) {
			
			condition = "loginSuccess";
		}else {
			condition = "loginFailure";
		}
		
		ActionForward forward = mapping.findForward(condition);
		return forward;		
     }

}
