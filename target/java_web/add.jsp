<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head><center>
<body><br><br>
     <form action="/person" method="post">
         <c:if test="${empty requestScope.person}">
            姓名: <input type="text" name="name">
        </c:if>
         <c:if test="${!empty requestScope.person}">
             姓名：${requestScope.person.name}
             <input name="name" value="${sessionScope.person.name}" type="hidden">
             <input name="id" value="${sessionScope.person.id}" type="hidden">
            <input name="_method" value="PUT" type="hidden">
        </c:if><br><br>
        邮箱:<input type="text" name="email"><br><br>
        性别：<select  name="gender">
             <option value="0">女</option>
             <option value="1">男</option>
             </select><br><br>
        部门：<select  name="d.id">
             <option value="101">D-AA</option>
             <option value="102">D-BB</option>
             <option value="103">D-CC</option>
             <option value="104">D-DD</option>
             <option value="105">D-EE</option>
             </select><br><br>
        <input type="submit" value="提交">
    </form>
</body></center>
</html>
