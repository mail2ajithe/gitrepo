<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Login Page</title>
</head>
<body>
    <div style="color:red">
    	
    </div>
<html:form action="/ValidateLogin"  onsubmit="validateValidateLoginForm(this);">
  <html:javascript formName="ValidateLoginForm" />

        User Name :<html:text name="ValidateLoginForm" property="userName" />
        Password  :<html:password name="ValidateLoginForm" property="password" />
        Phone Number :<html:text name="ValidateLoginForm" property="phoneNumber" />
        <html:submit value="Login" />
    </html:form>
</body>
</html>