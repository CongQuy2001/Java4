<%@ page pageEncoding="UTF-8"%>

<h3>User Edition</h3>

${message }

<form action="userSevlet" method="post">
	<div class = "login" style= "width : 300px; height: 350px; background-color: #1c8ef8; border:1px solid grey; border-radius:10px;text-align:center; ">
	<h2 style= "display : inline-block; color : grey">Member Login</h2>
	<br>
	<p style= "display:inline-block; float: left; padding-left : 40px; margin: 0px">Username:</p>
	<br>
      <input name="username"value="${form.username}"style="width : 200px; height: 40px;border-radius:5px; border : 1px solis grey; margin-boytom: 10px; margin-top : 5px">
		 <br> 
		<p style= "display:inline-block; float: left; padding-left : 40px;margin: 0px">Password:</p>
		<br>
		<input name="password" type="password" style="width : 200px; height: 40px;border-radius:5px; border : 1px solis grey;margin-boytom: 10px; margin-top : 5px">
		<br>
		 <input
			name="remember" type="checkbox" checked="${form.remember?'checked':''}">Remember me?
		<hr>
		<button style="width : 220px; height: 40px;border-radius:5px; border : none;background-color:	#FF0000; color: white ">Login</button>
		</div>
	</form>
