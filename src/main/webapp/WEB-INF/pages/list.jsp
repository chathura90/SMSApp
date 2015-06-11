<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chathura
  Date: 6/5/15
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All Received Message Details</title>
</head>
<body>
<center>

    <div style="color: teal; font-size: 30px">All Received Message Details</div>

    <c:if test="${!empty receiveList}">
        <table border="1" bgcolor="black" width="600px">
            <tr
                    style="background-color: teal; color: white; text-align: center;"
                    height="40px">

                <td>Application Id</td>
                <td>Source Address</td>
                <td>Message</td>
                <td>Request Id</td>
                <td>Encoding</td>
                <td>Version</td>
                <td>Delete</td>
            </tr>
            <c:forEach items="${receiveList}" var="user">
                <tr
                        style="background-color: white; color: black; text-align: center;"
                        height="30px">

                    <td><c:out value="${user.applicationId}" />
                    </td>
                    <td><c:out value="${user.sourceAddress}" />
                    </td>
                    <td><c:out value="${user.message}" />
                    </td>
                    <td><c:out value="${user.requestId}" />
                    </td>
                    </td>
                    <td><c:out value="${user.encoding}" />
                    </td>
                    </td>
                    <td><c:out value="${user.version}" />
                    </td>
                    <td><a href="delete?id=${user.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>


    <%--<a href="form">Click Here to add new User</a>--%>
</center>
</body>
</html>
