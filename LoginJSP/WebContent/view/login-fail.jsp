<%@ page import="model.ModelLoginBean" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="REFRESH" CONTENT="5;URL=view/login-form.jsp" >
<title>Login Fail</title>
</head>
<body>

<p>Error! usuario o contraseña incorrecta.</p>

<a href="view/login-form.jsp">Volver al login</a>

<%
	ModelLoginBean mlbean = (ModelLoginBean)request.getAttribute("bean");	
	out.print("<b> Seccion <br>Estado: </b>" + mlbean.getSesion());
	%>
</body>
</html>