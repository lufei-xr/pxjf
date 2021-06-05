<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查用户上传信息</title>
</head>
<body>
<h3>显示用户信息</h3>
<hr/>
<table border="1px" cellpadding="10px" cellspacing="0px">
<tr>
<td>文件编号</td>
<td>用户编号</td>
<td>原始名</td>
<td>存储名</td>
<td>预览</td>
<td>文件类型</td>
<td>存储时间</td>
</tr>
<c:forEach items="${list}" var="p">
<tr>
<td>${p.upid}</td>
<td>${p.uid}</td>
<td>${p.oldName}</td>
<td>${p.newname}</td>
<td> <image src="images/${p.newname}" width="100px"/></td>
<td>${p.contentType}</td>
<td>${p.uploadTime}</td>
<td>
<a href="down?newname=${p.newname}&contentType=${p.contentType}">下载</a>
</td>
</tr>

</c:forEach>

</table>
</body>
</html>