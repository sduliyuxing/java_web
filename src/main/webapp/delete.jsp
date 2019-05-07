<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\31 0031
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete</title>
</head>
<body>
     <center><br><br><br>
         <form action="/person" method="post">
             确认要删除${sessionScope.person.name}吗？<br><br>
             <input name="id" value="${sessionScope.person.id}" type="hidden">
             <input name="_method" value="DELETE" hidden>
             <input type="submit" value="确认"><br><br>
             <a href="/persons">取消</a><br><br>
         </form>
     </center>
</body>
</html>
