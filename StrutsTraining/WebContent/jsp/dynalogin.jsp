<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Login Page</title>
</head>
<body>
    <div style="color:red">
    	<html:errors />
    </div>
    <html:form action="/DynaLogin" >
        User Name :<html:text name="DynaLoginForm" property="userName" />
        Password  :<html:password name="DynaLoginForm" property="password" />
        <html:submit value="Login" />
    </html:form>
</body>
</html>