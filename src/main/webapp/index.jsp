<%-- 
    Document   : index
    Created on : 21 Feb, 2019, 11:45:34 AM
    Author     : Regis charles
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
    <a href="homepage">Click for home</a>
    <form action="add">
       UserName :<input type="text" name="username"/><br>
      Password:  <input type="text" name="password"/><br>
        <input type="submit" />
        
    </form>
    <p>${error}</p>
</body>
</html>
