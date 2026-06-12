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

						<form action="product" method="post" enctype="multipart/form-data">
							<input type="hidden" name="sid" value="<%=s.getId()%>"
								class="form-control" id="email">
							<div class="form-group">
								<label class="text-black" for="email">Product Image</label> <input
									type="file" name="image" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Product Name</label> <input
									type="text" name="pname" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Product Price</label> <input
									type="text" name="pprice" class="form-control" id="email">
							</div>
							<div class="form-group">
								<label class="text-black" for="email">Product Category</label> <input
									type="text" name="pcategory" class="form-control" id="email">
							</div>

							<br>
							<button type="submit" name="action" value="upload"
								class="btn btn-primary-hover-outline">Upload</button>
						</form>

					</div>

				</div>

			</div>

		</div>


	</div>
</body>
</html>