<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="imageFolder" value="resources/img/" />

<c:if test="${!empty productList}">
		<table class="tg">
			
			<c:forEach items="${productList}" var="product">
				<tr>
				<%-- 	<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td> --%>
					<td>
					<img alt="${product.name}"
				src="${imageFolder}${product.id}.JPG"></td>
				<td><a class="icon-shopping-cart"
				href="myCart/add/${product.id}">Add To Cart </a></td>
				</tr> <br>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>