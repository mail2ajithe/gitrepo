package com.magnolia.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.magnolia.struts.form.UserForm;

public class UserAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1,
     * where "method" is the value specified in <action> element : 
     * ( <action parameter="method" .../> )
     */
    public ActionForward add(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside add user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside update user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside delete user method.");
        return mapping.findForward(SUCCESS);
    }
}