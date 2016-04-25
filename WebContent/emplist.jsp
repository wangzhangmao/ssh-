<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>

<%@ page import="com.atguigu.spring.entity.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



	<s:if test="#request.employees==null || #request.employees.size()==0">
                                                    没有员工信息
</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>LASTNAME</td>
				<td>EMAIL</td>
				<td>BIRTH</td>
				<td>CREATETIME</td>
				<td>DEPT</td>
				<td>DELETE</td>
				<td>EDIT</td>
			</tr>
			<s:iterator value="#request.employees">
				<tr>
					<td>${id }</td>
					<td>${lastName }</td>
					<td>${email }</td>
					<td>
					<s:date name="birth" format="yyyy-mm-dd"  />
					</td>
					<td>${createTime }</td>
					<td>${department.getDepartmentName() }</td>
					<td><a href="emp-delete?id=${id }">Delete</a></td>
					<td><a href="emp-edit?id=${id }">Edit</a></td>
				</tr>
			</s:iterator>
		</table>
	</s:else>


</body>
</html>