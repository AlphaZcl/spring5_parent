<%--
  Created by IntelliJ IDEA.
  User: zclys
  Date: 2020/11/9
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/web/request/handler01?username=苏宇&id=01">handler01</a>
    <br/>
    <a href="/web/request/handler02">handler02</a>
    <br/>
    <a href="/web/request/handler03">handler03</a>
    <br/>
    <a href="/web/request/handler04">handler04</a>
    <br/>
    <form action="/web/request/handler05" method="post">
        msgid:<input type="text" name="msgid" ><br/>
        comId:<input type="text" name="comId" ><br/>
        rsvFlg:<input type="text" name="rsvFlg" ><br/>
        unisocCdtCd:<input type="text" name="copNm.unisocCdtCd" ><br/>
        entNm:<input type="text" name="copNm.entNm" ><br/>
        acctSts:<input type="text" name="copNm.acctSts"><br/>
        <input type="submit" value="POJO入参提交">
    </form>
<br/>
<a href="/web/request/handler06">Servlet 原生API</a>
</body>
</html>
