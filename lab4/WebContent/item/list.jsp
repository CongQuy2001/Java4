<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
 
<jsp:directive.page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title> Bài 4</title>
</head>
<body>
<div class="container">
 <div class="row p-2">
	<h2>Danh Sách sản Phẩm</h2>
        <c:forEach var="item" items="${items}">
        	<div class="col mt-2">
        		<a href="/lab4/ListServlet?name=${item.name}" class="card bg-dark text-light text-decoration-none text-center" style="width: 18rem;">
        			<h5 class="card-title py-3">${item.name}</h5>
        			<img src="images/${item.image }" class="card-img-top" alt="...">
        			<div class="card-body">
          				<p class="card-text"><strike>${item.price}</strike></p>
			  			<p class=" text-danger">${item.price*(1-item.discount)}</p>
        			</div>
        		</a>
			</div>
        </c:forEach>
</div>
</div>
</body>
</html>