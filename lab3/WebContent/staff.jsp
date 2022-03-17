<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StaffServlet" method="post"enctype="multipart/form-data">
	<h2>THÔNG TIN CÁ NHÂN</h2>
		Họ và tên: <input name="fullname"/><br>
        Hình ảnh : <input type="file" name="photo-file"/><br>
		 Ngày sinh:<input name="birthday"/><br> Quốc tịch: <select name="country">
			<option value="VN">Việt Nam</option>
			<option value="US">United States</option>
		</select><br/> Giới tính: <input name="gender" type="radio" value="true"/>Nam
		<input name="gender" type="radio" value="false"/>Nữ<br> TT
		hôn nhân: <input name="married" type="checkbox"/>Đã có gia
		đình?<br> Sở thích: <input name="hobbies" type="checkbox"
			value="Đọc sách"/>Đọc sách <input name="hobbies" type="checkbox"
			value="Du lịch"/>Du lịch <input name="hobbies" type="checkbox"
			value="Âm nhạc"/>Âm nhạc <input name="hobbies" type="checkbox"
			value="Khác"/>Khác<br> Ghi chú:
		<textarea name="notes" rows="3" cols="30"></textarea>
		<hr/>
		<button>Thêm mới</button>
	</form>
</body>
</html>