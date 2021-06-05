<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传</title>
</head>
<body>
<h3>springmvc上传</h3>
<hr/>
<form action="upload" method="post" enctype="multipart/form-data">
用户id:<input type="text" name="uid" value=""/> <br/>
用户名：<input type="text" name="uname" value=""/><br/>
头像:<input type="file" name="photo"/><br/>
<input type="submit" value="上传"/>

</form>
</body>
</html>