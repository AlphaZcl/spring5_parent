<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%--<h2>Hello World!</h2>--%>
<a href="/web/helloWorld.do">test Hello</a>
<br/>
<form action="/web/handler01" method="post">
    <input type="submit" value="handler01"/>
</form>
<br/>
<a href="/web/handler02">handler02-params测试</a>
<br/>
<a href="/web/handler03">handler03-headers测试</a>
<br/>
<a href="/web/ant/test01">RequestMapping-Ant</a>
<br/>
<a href="/web/user/123">RequestMapping-Ant</a>

</body>
</html>
