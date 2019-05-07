<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\26 0026
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%--<head>--%>
    <title>list</title>
    <%--SpringMVC 处理静态资源:--%>
    <%--1. 为什么会有这样的问题:--%>
    <%--优雅的 REST 风格的资源URL 不希望带 .html 或 .do 等后缀--%>
    <%--若将 DispatcherServlet 请求映射配置为 /,--%>
    <%--则 Spring MVC 将捕获 WEB 容器的所有请求, 包括静态资源的请求, SpringMVC 会将他们当成一个普通请求处理,--%>
    <%--因找不到对应处理器将导致错误。--%>
    <%--2. 解决: 在 SpringMVC 的配置文件中配置 <mvc:default-servlet-handler/>--%>
    <%--<script type="text/javascript" src="jquery-1.9.1.min.js"></script>--%>
    <%--<script type="text/javascript">--%>
        <%--$(function(){--%>
            <%--$(".delete").click(function(){--%>
                <%--var href = $(this).attr("href");--%>
                <%--$("form").attr("action", href).submit();--%>
                <%--return false;--%>
            <%--});--%>
        <%--})--%>
    <%--</script>--%>
<%--</head>--%>
<body>
        <%--<form action="" method="POST">--%>
            <%--<input type="hidden" name="_method" value="DELETE"/>--%>

        <%--</form>--%>

     <center><br><br>
         <c:if test="${empty requestScope.person}">没有任何员工</c:if>
         <c:if test="${!empty requestScope.person}">
             <table border="1" cellspacing="0" cellpadding="10">
                 <tr>
                     <td>编号</td>
                     <td>姓名</td>
                     <td>邮箱</td>
                     <td>性别</td>
                     <td>部门</td>
                     <td>编辑</td>
                     <td>删除</td>
                 </tr>
                 <c:forEach items="${requestScope.person}" var="p">
                     <tr>
                         <td>${p.id}</td>
                         <td>${p.name}</td>
                         <td>${p.email}</td>
                         <td>${p.gender==0?"女":"男"}</td>
                         <td>${p.d.name}</td>
                         <td><a href="/person/${p.id}">编辑</a></td>
                         <td><a href="/delete/${p.id}">删除</a></td>
                     </tr>
                 </c:forEach>
             </table>
         </c:if>
         <br><a href="/person">新增员工</a><br>
     </center>
</body>
</html>
