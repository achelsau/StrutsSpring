<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
    <div style="color:red">
    	<html:errors />
    </div>
    <html:form action="/login" >
        User Name :<html:text name="loginForm" property="username" />
        Password  :<html:password name="loginForm" property="password" />
        <html:submit value="Login" />
    </html:form>
</body>
</html>