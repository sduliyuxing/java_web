<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\10\22 0022
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body><center>

      <a href="/persons">all person</a><br><br><br>


      <a href="boot.contro.hello">boot.contro.hello</a><br><br>
      <a href="testmapping">testmapping</a><br><br>
      <a href="testmethod">testmethod</a><br><br>
      <form action="/testmethod" method="post">
          <input type="submit" value="submit">
      </form>
      <a href="mvc/123/abc">mvc/*/abc</a><br><br>
      <a href="testid/1">testid</a><br><br>
      <a href="/test/1">get</a><br><br>
      <form action="/test" method="post">
          <input type="submit" value="post">
      </form>
      <form action="/test/1" method="post">
          <input type="hidden" name="_method" value="PUT">
          <input type="submit" value="put">
      </form>
      <form action="/test/1" method="post">
          <input type="hidden" name="_method" value="DELETE">
          <input type="submit" value="delete">
      </form>
      <a href="testparam?id=10&name=abc">testparamid</a><br><br>
      <a href="testparam?name=abc">testparam</a><br><br>
      <a href="testheader">testheader</a><br><br>
      <a href="testcookie">testcookie</a><br><br>
      <form action="/testpojo" method="post">
          name:<input type="text" name="name"><br>
          address:<input type="text" name="address"><br>
          age:<input type="text" name="age"><br>
          id:<input type="text" name="b.id"><br>
          bname:<input type="text" name="b.bname"><br>
          <input type="submit" name="pojo">
      </form>
      <a href="/testmodelview">testmodelview</a><br><br>
      <a href="/testmap">testmap</a><br><br>
      <a href="testsessionattributes">testsessionattributes</a><br><br>
      <form action="testmodelattribute" method="Post">
          <input type="hidden" name="id" value="1"/>
          bname:<input name="bname" value="java"><br>
          <input type="submit" value="Submit"/><br>
      </form>
      <a href="/testredirect">testredirect</a><br><br>
      <%--<a href="/testview">testview</a>--%>
  </center>
  </body>
</html>
