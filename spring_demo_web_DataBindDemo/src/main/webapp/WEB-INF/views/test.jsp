<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2021/1/27
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="userVO" class="top.zhuchl.spring.vo.UserVO" scope="request"/>
<html>
<head>

</head>
<body>
<%--<a href="/web/DataBind/bind3?user=张三|1993-06-18|">bind3</a>--%>
<br/>
<form:form action="/web/DataBind/bind2" method="post" modelAttribute="userVO">
    <fm:message key="web.username"/> <form:input path="userName"/><form:errors path="userName"/>
    <br/>
    <fm:message key="web.birth"/><form:input path="birth"/><form:errors path="birth"/>
    <br/>
    <fm:message key="web.salary"/><form:input path="salary"/><form:errors path="salary"/>
    <br/>
    <input type="submit" name="提交">
</form:form>

<%--<form action="/web/DataBind/bind2" method="post">--%>
<%--    姓名：<input type="text" name="userName"/>${errorInfo.userName}--%>
<%--    <br/>--%>
<%--    生日：<input type="text" name="birth"/>${errorInfo.birth}--%>
<%--    <br/>--%>
<%--    薪资：<input type="number" name="salary" step="0.01"/>${errorInfo.salary}--%>
<%--    <br/>--%>
<%--    <input type="submit" name="提交">--%>
<%--</form>--%>
</body>
</html>
