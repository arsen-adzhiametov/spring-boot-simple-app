<%--
  Created by IntelliJ IDEA.
  User: Kalpazan
  Date: 18-Nov-14
  Time: 01:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Book Form</title>
</head>
<body>
<form method="post" action="edit?id=${book.id}">
  <label for="author">Author</label>
  <input id="author" name="author" value="${book.author}"/><br/>
  <label for="title">Title</label>
  <input id="title" name="title" value="${book.title}"/><br/>
  <label for="pages">Pages</label>
  <input id="pages" name="numberOfPages" value="${book.numberOfPages}"/><br/>
  <input type="submit" value="Submit"/>
</form>

</body>
</html>
