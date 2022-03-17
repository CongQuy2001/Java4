<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<jsp:directive.page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"/>


<html>
<head>
<meta charset="UTF-8">
<title>Bài 3</title>
</head>
<body>
<form action="">
<br>  Tên sản phẩm: ${item.name} 
<br> <img  src="images/${item.image }">	
 <br>  Giá gốc: <strike>${item.price}</strike>
 <br>   Giá mới:
        <c:set var="newprice" value="${item.price*(1-item.discount)}"/>
        <fmt:formatNumber value="${newprice}"/>
 <br>    Mức giá :
<c:choose>
 <c:when test="${newprice < 10}">Giá thấp</c:when>
<c:when test="${newprice > 100}">Giá cao</c:when>
<c:otherwise>Bình thường</c:otherwise>
</c:choose>
</form>
</body>
</html>