
<%@ page language="java" contentType="text/html;charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<body>
<h2>Login Page</h2>
<form action="login" method="POST">
<p>Username:<input type="text" name="username"/></p>
<p>Password:<input type="password" name="password"/></p>
<%
     if(request.getAttribute("error") != null){
          out.print("<p>Invalid Credential</p>");
        }
     %>
<input type="submit" value="Login"/>
<p>Not an User,Register<input type="submit" value="Register"/></p>

</form>
</body>
</html>
