<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Timing</title>
</head>
<body>
<form action="/add" method="post">
    <label>Item name: </label>
    <input name="item_name" type="text">
    <label>Item price: </label>
    <input type="number" min="0" max="2000000" name="item_price">
    <label>Item amount: </label>
    <input type="number" min="0" name="item_amount">
    <button>ADD ITEM</button>
</form>
</body>
</html>