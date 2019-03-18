<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center" >
<form action="login" method="post">
<table border="1">
<tr>
<td colspan="2"><h1 ><font face="Arial, Helvetica">登陆图书管理系统</font></h1></td>
</tr>
<tr>
<td style="background-color: #3385ff;width: 100px">用户名:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td style="background-color: #3385ff;">密码:</td>
<td><input type="text" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="登陆"></td>
</tr>
<tr>
<td colspan="2"><span style="color: red">${info}&nbsp</span></td>
</tr>
</table>
</form>
</div>
<%-- <% response.setHeader("refresh", "1.5;URL=doServlet?tp=select"); %> --%>
</body>
</html>