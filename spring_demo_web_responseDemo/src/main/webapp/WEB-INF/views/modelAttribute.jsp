<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2020/11/15
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>MODEL ATTRIBUTE</h4>
PageContext: ${pageScope.user}  ${pageScope.param2}<br/>
request: ${requestScope.user}  ${requestScope.param2}<br/>
session: ${sessionScope.user}  ${sessionScope.param2}<br/>
application: ${applicationScope.user}  ${applicationScope.param2}<br/>
</body>
</html>
