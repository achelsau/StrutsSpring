<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
</head>
<body>
<h1>Choose a role:</h1>
<form action="">
  <input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other
</form>
<%-- <html:form action="/postSelectRole"> --%>
<%--   <html:radio name="gender" property="role" value="male">Male</html:radio><br> --%>
<%--   <html:radio name="gender" property="role" value="female">Female</html:radio><br> --%>
<%--   <html:radio name="gender" property="role" value="other">Other</html:radio> --%>
<%-- </html:form> --%>

</body>
</html>