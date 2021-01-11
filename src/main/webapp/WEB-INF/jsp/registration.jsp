<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>
    <meta charset="UTF-8">
    <title>Registration</title>
<style>
.myclass{
background: #ff0000;
}
</style>
</head>
<body>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
    <form:errors path="*" cssClass="myclass" element="div"/>
        <table>
            <tr>
                <td>
                <spring:message code="name"/>
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                     <form:input path="name" error="myclass"/>
                    </td>
            </tr>
            <tr>
                <td colspan="3">

                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>