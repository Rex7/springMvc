<%-- 
    Document   : display
    Created on : 21 Feb, 2019, 9:38:25 AM
    Author     : Regis charles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inventory System</h1>
        <h1>Welcome User ${user}</h1>
        <form action="mypage" method="post">
            Product Name <input type="text" name="productName" ><br>
            Price:    <input type="text" name="price"><br>
            Quantity: <input type="text" name="quantity" ><br>
            <input type="submit" value="Submit">
        </form>
        <a href="mypage">click me</a>
    </body>
</html>
