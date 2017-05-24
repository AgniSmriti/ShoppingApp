<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
</style>

</head>
<body>
<jsp:include page="header.jsp"/>

${msg}




<fm:form action="${pageContext.request.contextPath}/manage_product" commandName="product" modelAttribute="product" enctype="multipart/form-data" method="post">
<c:if test="${not empty product.proName }">

<fm:input type="text" path="proId" disabled="true" readOnly="true"/>
<fm:hidden path="proId"/>
</c:if>
<br>
<td>ProductName:</td>

<fm:input type="text" path="proName"></fm:input>
File upload<fm:input path="image" type="file" name="image"/>



 Category id


<select name="catId">
<c:forEach items="${categoryList}" var="category">
<option value="${category.catId}">${category.catId}</option>
</c:forEach>

</select>


<br>
Supplier id


<select name="supId">
<c:forEach items="${supplierList}" var="supplier">
<option value="${supplier.supId}">${supplier.supId}</option>
</c:forEach>

</select>
<tr>
				<td colspan="2"><c:if test="${!empty product.proName}">
						<input type="submit" value="<spring:message text="Update Product"/>" />
					</c:if> <c:if test="${empty product.proName}">
						<input type="submit" value="<spring:message text="Add Product"/>" />
					</c:if></td>
			</tr>


</fm:form>
<br>
<br>

<c:if test="${not empty productList}">
Product LIST  
<table style="width:100%">
  

  <tr>
    <th>ID</th>
    <th>NAME</th> 
    <th>OPERATIONS</th>
 </tr>
  <c:forEach items="${productList}" var="product">
 
 <tr>
 <td>${product.proId}</td>
<td>${product.proName}</td>

  </tr>

<tr>
</c:forEach>
</table>


</c:if> 


</body>
</html>

