<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài 2+3</title>
</head>
<body>
	<div class="container" Style="margin-top: 10px">
		<div class="row"
			Style="border: 1px darkgrey solid; boder-radius: 10px; width: 50%; margin: 0 auto; padding: 20px;">
			<div class="col-sm-12">
				<h2>Thông Tin Cá Nhân</h2>
				<form action="./Register" method="post">
					<div class="form-group">
						<label>userName</label> <input type="text" name="username"
							class="form-control" placeholder="Enter UserName">
					</div>
					<div class="form-group">
						<label>Age</label> <input type="text" name="age"
							class="form-control" placeholder="Enter Age" Value="0">
					</div>
					<div class="form-group">
						<label for="">Country</label> <select name="country"
							class="form-control">
							<option>VIET NAM</option>
							<option>LAO</option>
							<option>NHAT BAN</option>
							<option>HAN QUOC</option>
						
						</select>
					</div>
					<div class="form-group">
						<label>Gender</label>
						<div class="radio">
							<!-- value =1 =>Nam| 0==> Nu-->
							<label class="checkbox-inline"> <input type="radio"
								name="gioiTinh" value="Nam">Male
							</label> <label class="checkbox-inline"> <input type="radio"
								name="gioiTinh" checked="checked" value="Gai">Female
							</label>
						</div>
					</div>
					<div class="form-group">
						<label>Hobby</label>
						<div class="form-check form -check-inline">
							<input class="form-check-input" name="soThich" value="Music"
								type="checkbox"> <label class="form-check-label">Music</label>
							<input class="form-check-input" name="soThich" value="Reading"
								type="checkbox"> <label class="form-check-label">Reading</label>
							<input class="form-check-input" name="soThich" value="Shopping"
								type="checkbox"> <label class="form-check-label">Shopping</label>
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Save</button>
					<button type="reset" class="btn btn-primary">Cancel</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>