<%--
  Created by IntelliJ IDEA.
  User: chathura
  Date: 6/5/15
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sending messages</title>
</head>
<body>
<center>

    <div style="color: teal; font-size: 30px">Send Message to a Phone</div>



    <c:url var="userSenMessage" value="" />
    <form:form id="sendMsgForm" modelAttribute="send" method="post"
               action="sendMsg">
        <table width="400px" height="150px">
            <tr>
                <td><form:label path="applicationId">Application Id</form:label>
                </td>
                <td><form:input path="applicationId" />
                </td>
            </tr>
            <tr>
                <td><form:label path="password" >Password</form:label>
                </td>
                <td><form:input path="password" />
                </td>
            </tr>
            <tr>
                <td><form:label path="destinationAddress">Destination Address</form:label>
                </td>
                <td><form:input path="destinationAddress" />
                </td>
            </tr>
            <tr>
                <td><form:label path="message">Message</form:label>
                </td>
                <td><form:input path="message" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Send" /></td>
            </tr>
        </table>
    </form:form>


    <a href="sendList">Click Here to see Send messages</a>
</center>
</body>
</html>
