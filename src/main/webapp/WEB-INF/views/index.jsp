<%--
  Created by IntelliJ IDEA.
  User: mar1
  Date: 2/21/20
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>YEs</title>
</head>
<body>
    <table border="1" cellpadding="5">
        <caption><h2>List of users</h2></caption>
        <tr>
            <th>ID</th>

        </tr>
        <c:forEach var="article" items="${articles}">
            <tr>
                <td><c:out value="${article.id}" /></td>
            </tr>
        </c:forEach>
    </table>
    <div>Hello world</div>
</body>
</html>
