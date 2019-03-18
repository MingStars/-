<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/resources/";
%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<div align = "center">
<form action="doInsert" method="post">
<table border="1">
<caption><h3>新增图书</h3></caption>
<tr><td width="200px" style="white-space:nowrap;" >书名<font color="red">(*)</font></td><td><input type="text" name="name" ></td></tr>
<tr><td>作者<font color="red">(*)</font></td><td><input type="text" name="author" ></td></tr>
<tr><td>出版社<font color="red">(*)</font></td><td><input type="text" name="publish" ></td></tr>
<tr><td>出版日期<font color="red">(*)</font></td><td><input type="text" name="publishdate" >(yyyy-MM-dd)</td></tr>
<tr><td>页数</td><td><input type="text" name="page" ></td></tr>
<tr><td>价格</td><td><input type="text" name="price" ></td></tr>
<tr><td>内容摘要</td><td><textarea name="content" rows="2" cols="10"   ></textarea></td></tr>
<tr><td colspan="2" align="center"><input type="submit" id="do" value="提交" >&nbsp&nbsp&nbsp<input type="button" onclick="javascript:history.back(-1);" value="返回"></td></tr>
</table>
</form>
</div>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$("form").submit(function() {

	var name = $("input[name='name']").val();
	var author = $("input[name='author']").val();
	var publish = $("input[name='publish']").val();
	var publishdate = $("input[name='publishdate']").val();
	if(name==""||author==""||publish==""||publishdate==""){
		alert("必填项不能为空");
        return false;
			
	}
})

</script>
</body>
</html>