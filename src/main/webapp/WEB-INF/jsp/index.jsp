<%--
  Created by IntelliJ IDEA.
  User: kkim
  Date: 2021/05/12
  Time: 10:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h3>Index Page</h3>
<c:forEach items="${msg}" var="msg">
    <div style="border-style: solid">${msg}</div>
</c:forEach>
</body>
</html>
