<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2020/11/9
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/web/user/001" method="post">
        <input type="submit" value="添加操作">
    </form>
    <br/>
    <form action="/web/user/002" method="post">
        <input type="hidden" name="_method" value="delete">
        <input type="submit" value="删除操作">
    </form>
    <br/>
    <form action="/web/user/003" method="post">
        <input type="hidden" name="_method" value="put">
        <input type="submit" value="更新操作">
    </form>
    <br/>
    <a href="/web/user/004">查询操作</a>
    <br/>
    <a href="request.jsp">request handler</a>
</body>
</html>
