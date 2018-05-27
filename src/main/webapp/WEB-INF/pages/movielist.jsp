<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- ${movies[1].name} --%>

<%-- value "<%= movies.getString("name") %>" --%>
	<%-- <c:forEach items="${movies}" var="m">
		<tr>
			<td><c:out value="${m.name}"></c:out></td>
			<td><c:out value="${m.year}"></c:out></td>
			<td><c:out value="${m.plot}"></c:out></td>
			<td><c:out value="${m.image}"></c:out></td>
		</tr>		
	</c:forEach> --%>
	
	<c:forEach items="${movies}" var="m">
		<c:forEach items="${m.actors}" var="a">
			<tr>
				<td>Actor Name : ${a.name}</td>
			</tr>	
			
			<td>
				<tr>Movie Name : ${m.name}</tr>
				<tr>Movie Year : ${m.year}</tr>
				<tr>Movie Plot : ${m.plot}</tr>
				<tr>Movie Image : ${m.image}</tr>
			</td>
		</c:forEach>
		<br>
	</c:forEach>		

</body>
</html>