<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2021/2/4
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="param" class="top.zhuchl.spring.VO.ParamVO" scope="request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/web/exception/dateExcept1" modelAttribute="param" method="post">
        <fmt:message key="web.date"/><form:input path="date"/><form:errors path="date"/>${errorInfo.date}<br/>
        <input type="submit" value="走你">
    </form:form>
    <br/>
    <form action="/web/exception/testExcept" method="get">
        <input type="text" name="param"/><br/>
        <input type="text" name="id"/><br/>
        <input type="submit" value="走着">
    </form>
    <br/>
    <a href="/web/exception/testDefaultHandlerExceptionResolver" >testDefaultEx</a>
</body>
</html>
