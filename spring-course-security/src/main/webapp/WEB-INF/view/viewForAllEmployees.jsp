<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info For All Employees</title>
</head>
<body>

    <h2>Info For All Employees</h2>
    <br><br>

    <security:authorize access="hasRole('HR')">
        <input type="button" value="Salary" onclick="window.location.href='hr_info'">
        <br><br>
        Only for HR staff
        <br><br>
    </security:authorize>

    <security:authorize access="hasRole('MANAGER')">
        <input type="button" value="Performance" onclick="window.location.href='manager_info'">
        <br><br>
        Only for Managers
    </security:authorize>

</body>
</html>
