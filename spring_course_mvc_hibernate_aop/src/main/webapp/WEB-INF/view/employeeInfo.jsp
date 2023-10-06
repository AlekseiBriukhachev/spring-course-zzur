<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Employee</title>
</head>
<body>

    <h2>Employee Info</h2>

    <%--@elvariable id="employee" type="com.aleksei.spring.mvc_hibernate_aop.entity.Employee"--%>
    <form:form action="saveEmployee" modelAttribute="employee">

        <form:hidden path="id"/>

        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Department <form:input path="department"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        <input type="submit" value="OK">
    </form:form>

</body>
</html>
