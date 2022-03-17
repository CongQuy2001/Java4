<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="uploadServlet" method="post" enctype="multipart/form-data">
<div class = "login" style= "width : 300px; height: 350px; background-color: #1c8ef8; border:1px solid grey; border-radius:10px;text-align:center; ">

<p style= "display:inline-block; float: left; padding-left : 40px">Hình ảnh:</p> 
<br>
<input type="file" name="photo_file" >
<br>
<p style= "display:inline-block; float: left; padding-left : 40px">Tài liệu: </p> 
<br>
<input type="file" name="doc_file"  >
<br>
<hr>
<button style="width : 220px; height: 40px;border-radius:5px; border : none;background-color:	#FF0000; color: white ">Upload</button>
</div>
</form>

</body>
</html>