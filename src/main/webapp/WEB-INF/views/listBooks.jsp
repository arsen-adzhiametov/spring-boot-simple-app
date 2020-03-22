<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Kalpazan
  Date: 18-Nov-14
  Time: 02:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Books</title>
</head>
<body>
  <c:forEach var="book" items="books">
    ${book}
    <%--<input type="button" value="edit?id=${book.id}" ><br/>--%>
  </c:forEach>
</body>
</html>
