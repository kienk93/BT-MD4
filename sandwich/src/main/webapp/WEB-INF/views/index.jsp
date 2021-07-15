
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<form>
    <input type="checkbox" name="abc" id="Tomato" value="Tomato">
    <label for="Tomato">Tomato</label>
    <input type="checkbox" name="abc" id="Mustard" value="Mustard">
    <label for="Mustard">Mustard</label>
    <input type="checkbox" name="abc" id="Lettuce" value="Lettuce">
    <label for="Lettuce">Lettuce</label>
    <input type="checkbox" name="abc" id="Sprouts" value="Sprouts">
    <label for="Sprouts">Sprouts</label>
    <button>Add</button>
</form>
<c:forEach items="${condiments}" var="abc">
    <span><c:out value="${abc}"></c:out></span>
</c:forEach>
</body>
</html>
