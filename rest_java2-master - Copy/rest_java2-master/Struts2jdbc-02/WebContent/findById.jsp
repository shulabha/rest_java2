<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
</style>

</head>
<body>
	<div class="content">
		<table class="customer1" cellpadding="5px">
			<tr class="even">
				<th>ID</th>
				<th>NAME</th>
			</tr>
			<%-- <s:iterator value="empList" status="empStatus"> --%>
			<tr>

				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
			</tr>
			<%-- </s:iterator> --%>
		</table>
	</div>
</body>
</html>