<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2020/11/10
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>SUCCESS</h4>
PageContext: ${pageScope.param1}  ${pageScope.param2}<br/>
request: ${requestScope.param1}  ${requestScope.param2}<br/>
session: ${sessionScope.param1}  ${sessionScope.param2}<br/>
application: ${applicationScope.param1}  ${applicationScope.param2}<br/>

</body>
</html>
