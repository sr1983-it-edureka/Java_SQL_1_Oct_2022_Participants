package com.edureka.javasql1.strutsdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class WelcomeAction extends Action{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	WelcomeModel welcomeModel = (WelcomeModel)form;
    	
    	welcomeModel.setMessage("Welcome to Struts - It may be complex, but it is not...");
    	
    	ActionForward actionForward = mapping.findForward("success");
        return actionForward;
    }

}
