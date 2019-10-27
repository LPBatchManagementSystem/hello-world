<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
<link href="css/style.css" rel="stylesheet"/>

</head>
<body>
<table border="2">
<tr>
<th>LP Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Phone Number</th><th>Designation</th><th>City</th><th>State</th><th>Country</th>
</tr>
<c:forEach items="${lpModelList}" var="lpModel">

<tr>
<td><c:out value="${lpModel.id}"/></td>
<td><c:out value="${lpModel.firstName}"/></td>
<td><c:out value="${lpModel.lastName}"/></td>
<td><c:out value="${lpModel.email}"/></td>
<td><c:out value="${lpModel.phoneNumber}"/></td>
<td><c:out value="${lpModel.role}"/></td>
<td><c:out value="${lpModel.city}"/></td>
<td><c:out value="${lpModel.state}"/></td>
<td><c:out value="${lpModel.country}"/></td>




</tr>

</c:forEach>

</table>

</body>
</html>