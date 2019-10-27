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
<th>Mentor Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Phone Number</th><th>Designation</th><th>City</th><th>State</th><th>Country</th>
</tr>
<c:forEach items="${mentorModelList}" var="mentorModel">

<tr>
<td><c:out value="${mentorModel.id}"/></td>
<td><c:out value="${mentorModel.firstName}"/></td>
<td><c:out value="${mentorModel.lastName}"/></td>
<td><c:out value="${mentorModel.email}"/></td>
<td><c:out value="${mentorModel.phoneNumber}"/></td>
<td><c:out value="${mentorModel.role}"/></td>
<td><c:out value="${mentorModel.city}"/></td>
<td><c:out value="${mentorModel.state}"/></td>
<td><c:out value="${mentorModel.country}"/></td>




</tr>

</c:forEach>

</table>

</body>
</html>