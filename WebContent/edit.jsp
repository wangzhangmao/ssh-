<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="emp-editsuccess" method="post">
<s:textfield name="lastName" label="LastName" disabled="true"></s:textfield>
<s:hidden name="id"></s:hidden>
<s:hidden name="lastName"></s:hidden>
<s:hidden name="createTime"></s:hidden>
<s:textfield name="email" label="Email" ></s:textfield>
<s:textfield name="birth" label="Birth"  ></s:textfield>

<s:select list="#request.deps" listKey="id" listValue="departmentName" 
name="department.id" label="Department"></s:select>

<s:submit></s:submit>
</s:form>
</body>
</html>