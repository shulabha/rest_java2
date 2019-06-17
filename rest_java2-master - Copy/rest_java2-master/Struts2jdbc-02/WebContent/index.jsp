<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Hello World Example</title>
</head>
<body>
	<h1>Find User by id</h1>

	<s:form action="hello">
		<s:textfield name="id" label="Employee Id" />
		<s:submit value="Find"></s:submit>
	</s:form>
	<br><br><br><br><br>
	<h1>Create new Entry</h1>
	
	<%-- <s:form action="hello">
		<s:textfield name="id" label="Employee Id" />
		<s:textfield name="name" label="Employee Name" />

		<s:submit value="save"></s:submit>
	</s:form> --%>
	
	<s:form action="uploadFile">
		<s:file name="file" label="Employee Data File" />
		<s:submit value="Upload"></s:submit>
	</s:form>
</body>
</html>