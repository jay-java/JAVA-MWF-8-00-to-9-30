<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="untree_co-section">
		<div class="container">

			<div class="block">
				<div class="row justify-content-center">


					<div class="col-md-8 col-lg-8 pb-4">

						<form action="customer" method="post">
							<div class="form-group">
								<label class="text-black" for="email">Name</label> <input
									type="text" name="name" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Contact</label> <input
									type="text" name="contact" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Address</label> <input
									type="text" name="address" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Email</label> <input
									type="email" name="email" class="form-control" id="email">
							</div>

							<div class="form-group">
								<label class="text-black" for="email">Password</label> <input
									type="password" name="password" class="form-control" id="email">
							</div>
							<br>
							<button type="submit" name="action" value="register"
								class="btn btn-primary-hover-outline">Register</button>
						</form>

					</div>

				</div>

			</div>

		</div>


	</div>
</body>
</html>