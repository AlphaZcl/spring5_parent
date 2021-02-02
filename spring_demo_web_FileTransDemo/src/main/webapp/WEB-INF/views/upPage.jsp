<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2021/2/1
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="/web/file/upFile2" method="post" enctype="multipart/form-data">
    文件1: <input type="file" name="files"/><br><br>
    文件2: <input type="file" name="files"/><br><br>
    描述: <input type="text" name="desc"/><br><br>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
