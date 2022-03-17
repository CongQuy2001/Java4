<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài 1</title>
</head>
<body>
	<form action="/tam-giac" method="post">
		<input name="a" placeholder="Cạnh a? "><br> <input
			name="b" placeholder="Cạnh b? "><br> <input name="c"
			placeholder="Cạnh c? ">
		<hr>
		<button formaction="/Lab2/dien-tich">Tính Diện Tích</button>
		<button formaction="/Lab2/chu-vi">Tính Chu Vi</button>
	</form>
	<h3>${message}</h3>
</body>
</html>