<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: CApp
  Date: 14.04.2020
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guest book posts</title>
</head>
<body>
<table border="1">

    <c:forEach items="${requestScope.posts}" var="post">
    <tr><td>${post.id}</td>
        <td>${post.txt}</td>
        <td>
            <a href="delete?id=${post.id}">
               <img src="delete.png"/>
           </a>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
