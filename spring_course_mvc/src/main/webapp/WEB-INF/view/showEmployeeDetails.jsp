<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Employee Details</title>
</head>
<body>

    <h2>Dear Employee, your are welcome!!!!</h2>

    <br><br>
    <%--@elvariable id="employee" type="com.aleksei.spring.mvc.controller.Employee"--%>

    Your name: ${employee.name}
    <br>
    Your surname: ${employee.surname}
    <br>
    Your salary: ${employee.salary}
    <br>
    Your department: ${employee.department}
    <br>
    Your phone number: ${employee.phoneNumber}
    <br>
    Your email: ${employee.email}
    <br>
    Your car: ${employee.carBrand}
    <br>
    Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>

</body>
</html>
