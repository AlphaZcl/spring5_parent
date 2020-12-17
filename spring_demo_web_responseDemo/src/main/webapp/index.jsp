<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<body>
<h2></h2>
<a href="/spring_demo_web_responseDemo/web/handler01">handler01</a><br/>
<a href="/spring_demo_web_responseDemo/web/handler02">handler02</a><br/>
<a href="/spring_demo_web_responseDemo/web/handler03">handler03</a><br/>
<a href="/spring_demo_web_responseDemo/web/handler04">handler04</a><br/>
<h4>ModelAttribute Test</h4>
<form action="/spring_demo_web_responseDemo/web/userInfo" method="post">
    <%--<input type="hidden" name="_method" value="put">--%>
    用户账号：<input type="text" name="userAccoNo"><br/>
    用户名：<input type="text" name="username"><br/>
    邮箱：<input type="text" name="email"><br/>
    手机号：<input type="text" name="phone"><br/>
    省：<input type="text" name="address.provice"><br/>
    市：<input type="text" name="address.city"><br/>
    区：<input type="text" name="address.street"><br/>
    <input type="submit" value="更新">
</form>
</body>
</html>
