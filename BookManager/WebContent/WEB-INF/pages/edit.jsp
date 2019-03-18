<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align = "center">
<form action="doUpdate" method="post">
<table border="1">
<caption><h3>编辑图书</h3></caption>
<tr><td width="200px" style="white-space:nowrap;" >书名<font color="red">(*)</font></td><td><input type="text" name="name" value="${book.name }"></td></tr>
<tr><td>作者<font color="red">(*)</font></td><td><input type="text" name="author" value="${book.author }"></td></tr>
<tr><td>出版社<font color="red">(*)</font></td><td><input type="text" name="publish" value="${book.publish }"></td></tr>
<tr><td>出版日期<font color="red">(*)</font></td><td><input type="text" name="publishdate" value="${book.publishdate }">(yyyy-MM-dd)</td></tr>
<tr><td>页数</td><td><input type="text" name="page" value="${book.page }"></td></tr>
<tr><td>价格</td><td><input type="text" name="price" value="${book.price }"></td></tr>
<tr><td>内容摘要</td><td><textarea name="content" rows="2" cols="10"   >${book.content }</textarea></td></tr>
<tr><td colspan="2" align="center"><input type="hidden" name="id" value="${book.id}"><input type="submit" value="提交">&nbsp&nbsp&nbsp<input type="button" onclick=”javascript:history.back(-1);” value="返回"></td></tr>
</table>
</form>
</div>
</body>
</html>