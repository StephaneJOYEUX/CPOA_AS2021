<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculatrice</title>
</head>
<body>
	Welcome to the new calculatrice - YES WE CAN
	<h1>Entrer une expression mathématique</h1>
	<s:form name="myForm"
		action="controller.CalculatriceController.calculer.action"
		method="POST">
		<s:textfield label="Expression" name="expression" />
		<s:submit name="submit" />
	</s:form>
</body>
</html>
