<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/19 0019
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
id:${requestScope.user.id}<br/>
email:${requestScope.user.email}<br/>
username:${requestScope.user.username}<br/>
role:${requestScope.user.role}<br/>
mobile:${requestScope.user.mobile}<br/>
</body>
</html>
