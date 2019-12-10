<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/11/27
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<fieldset>
    <legend>登录</legend>
    <form action="<%=request.getContextPath()%>/useryanzhen" method="post">
        用户名：<input type="text" name="username"><br>
        密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="userpwd"><br>
        <input type="submit" value="登录">
    </form>
</fieldset>
</body>
</html>
