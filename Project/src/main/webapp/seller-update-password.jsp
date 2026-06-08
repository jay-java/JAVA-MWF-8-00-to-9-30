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
						<%
						String msg = (String) request.getAttribute("msg");
						if (msg != null) {
						%>
						<h2 class="mb-4 section-title">
							<%
							out.print(msg);
							%>
						</h2>
						<%
						}
						%>
						<%
						String email = (String) request.getAttribute("email");
						%>
						<form action="seller" method="post">
							<input type="hidden" name="email" value="<%=email%>">
							<div class="form-group">
								<label class="text-black" for="email">New Password</label> <input
									type="password" name="np" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Confirm new
									Password</label> <input type="password" name="cnp" class="form-control"
									id="email">
							</div>
							<br>
							<button type="submit" name="action" value="up"
								class="btn btn-primary-hover-outline">Change</button>
						</form>

					</div>

				</div>

			</div>

		</div>


	</div>
</body>
</html>