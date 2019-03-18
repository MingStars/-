<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js">
</script>
</head>
<body >
<div align="center">
<form action="getAllBook"  method="post">
<table  border="1">
<caption><h4>图书详细信息列表</h4></caption>
<tr>
<th width="80px">书名</th>
<th width="80px">作者</th>
<th width="120px">出版社</th>
<th width="120px">出版日期</th>
<th width="80px">页数</th>
<th width="80px">价格</th>
<th width="80px">内容摘要</th>
<th width="80px">操作</th></tr>
<c:forEach items="${lis}"  var="book" varStatus="vs">
<tr ${vs.count%2==1? "style='background-color:#3385ff'" : "style='background-color:white'"}>
<td align="center">${book.name }</td>
<td align="center">${book.author }</td>
<td align="center">${book.publish }</td>
<td align="center">${book.publishdate }</td>
<td align="center">${book.page }</td>
<td align="center">${book.price }</td>
<td align="center">${book.content }</td>
<td align="center"><a href="toUpdate?id=${book.id }">修改</a>&nbsp<a href="doRemove?id=${book.id}">删除</a></td>
</tr>
</c:forEach>
<tr ><td colspan="8"><a href="toInsert"><input type="button" value="新增图书" ></a>共${count}条记录   每页<input type="text" size="5" 
  name="pageSize" value="${pageSize }">条     第${pageIndex }页/共${pageCount}页        <a href="getAllBook?pageIndex=1&pageSize=${pageSize }">首页   
     </a><a href="getAllBook?pageIndex=${pageIndex-1 }&pageSize=${pageSize }">上一页     </a><a href="getAllBook?pageIndex=1&pageSize=${pageIndex+1 }">下一页     </a><a href="getAllBook?pageIndex=${pageCount }&pageSize=${pageSize }">末页     </a> 
       转到<input size="5" name="pageIndex" type="text"   value="${pageIndex }">页  <input type="submit" value="GO">
</td></tr>
</table>
</form>
</div>
</body>
</html>