<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="seller-header.jsp"%>
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

						<form action="seller" method="post">
							<input type="hidden" name="id" value="<%=s.getId()%>"
								class="form-control" id="email">
							<div class="form-group">
								<label class="text-black" for="email">Old Password</label> <input
									type="password" name="op" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">New Password</label> <input
									type="password" name="np" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Confirm New
									Password</label> <input type="password" name="cnp" class="form-control"
									id="email">
							</div>
							<br>
							<button type="submit" name="action" value="update"
								class="btn btn-primary-hover-outline">Update</button>
						</form>

					</div>

				</div>

			</div>

		</div>


	</div>
</body>
</html>