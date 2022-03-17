<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri= "http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:setLocale value="${sessionScope.LANG}"/>
<fmt:setBundle basename="i18n.lang"/>
<h1>LAP TRINH JAVA4</h1>
<hr>
<p>
<a href= "./homeServlet"><fmt:message>menu.home </fmt:message></a>
<a href= "./newsServlet"><fmt:message>menu.news </fmt:message></a>
<a href= "./contacsServlet"><fmt:message>menu.contact </fmt:message></a>
<a href= "?lang=en_US"> <fmt:message>menu.english </fmt:message></a>
<a href= "?lang=vi_VN"> <fmt:message>menu.vietnamese </fmt:message></a>
</p>
<hr>
<h2> <fmt:message>contact.content </fmt:message></h2>
</body>
</html>