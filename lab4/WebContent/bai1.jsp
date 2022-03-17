<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title> Bài 1</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
      integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
      integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <div class="container">
           <jsp:include page= "menu.jsp"/>
      <div class="row">
        <div class="col-md-9">
			<div class="row">
				 <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
                <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
                <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
                <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
                <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
                <jsp:include page= "item.jsp">
				 <jsp:param value="desktop.jpg" name="images"/>
				  <jsp:param value="Desktop computer" name="name"/>
               </jsp:include>
			</div>
		</div>
        <div class="col-md-3">
		 <jsp:include page= "login.jsp"/>

              <jsp:include page= "category.jsp"/>
        </div>
      </div>
    </div>
  </body>
</html>
