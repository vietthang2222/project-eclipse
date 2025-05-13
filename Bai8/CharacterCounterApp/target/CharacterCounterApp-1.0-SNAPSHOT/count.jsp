<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Character Counter</title></head>
<body>
    <h2>Nhap chuoi ky tu:</h2>
    <form action="count" method="post">
        <input type="text" name="inputString" value="${param.inputString}" />
        <input type="submit" value="Nh?p" />
    </form>

    <c:if test="${not empty count}">
        <p>Chuoi ban nhap: <strong>${inputString}</strong></p>
        <p>So ky tu: <strong>${count}</strong></p>
        <c:if test="${count > 10}">
            <p style="color:red;">Chuoi dai han 10 ky tu!</p>
        </c:if>
    </c:if>
</body>
</html>
