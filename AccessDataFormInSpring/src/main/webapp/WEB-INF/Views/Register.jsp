<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
	<div class = "container mt-3 mx-auto">
		<h1 class = "w-50 mx-auto">Register</h1>
	</div>
	<div class = "container mx-auto mt-4 ">
	<form class = "form" name = "fm" action = "${pageContext.request.contextPath}/save" method = "POST">
	<div class = "row w-50 mx-auto mt-2">
		<label class = "form-label" for= "name">Enter Name</label>
		<input class = "form-control" name = "name" type = "text" value = "" />
	</div>
	<div class = "row w-50 mx-auto mt-2">
		<label class = "form-label" for = "email">Enter Email Id</label>
		<input class = "form-control" name = "email" type = "email" value = "" />
	</div>
	<div class = "row w-50 mx-auto mt-2">
		<label class = "form-label" for="contact">Enter Contact Number</label>
		<input class = "form-control" name = "contact" type = "number" value = "" />
	</div>
	<div class = "row w-50 mx-auto mt-2">
		<label class = "form-label" for = "password">Enter Password</label>
		<input class = "form-control" id = "pass1" name = "password" type = "password" value = "" />
	</div>
	<div class = "row w-50 mx-auto mt-2">
		<label class = "form-label" for = "confirmPass">Confirm Password</label>
		<input class = "form-control" id = "pass2" onkeyup = "passCheck()" name = "confirmPass" type = "password" value = "" />
	</div>
	<div class = "row w-50 mx-auto mt-2">
		<span id = "spn"></span>
	</div>
	<div class = "row w-50 mx-auto mt-3">
		<input type= "submit"  class = "btn btn-primary w-25"/>
	</div>
	</form>
	</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>
<script src = "${pageContext.request.contextPath}/JS/PasswordCheck.js"></script>
</html>