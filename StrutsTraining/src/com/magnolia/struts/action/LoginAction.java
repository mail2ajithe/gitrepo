package com.magnolia.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.magnolia.struts.form.LoginForm;

public class LoginAction extends org.apache.struts.action.Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("Inside Execute method of LoginAction");
		LoginForm loginForm = (LoginForm) form;
		ActionErrors errors = new ActionErrors();
		
		if("Magnolia".equalsIgnoreCase(loginForm.getUserName())){
			System.out.println("Business Error occured... Capturing the error");
			errors.add("userName", new ActionMessage("error.userName.magnolia"));
			saveErrors(request, errors);
			return (new ActionForward(mapping.getInput())); 
		}
		if (loginForm.getUserName().equals(loginForm.getPassword())) {
			return mapping.findForward(SUCCESS);
		} else {
			return mapping.findForward(FAILURE);
		}
	}
}

