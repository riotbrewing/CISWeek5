<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap/css/bootstrap-min.css">
  </head>
  <body >
  <h1 >Hello</h1>
  <form method = "post" action = "navServlet">
	  <table>
		<c:forEach items="${requestScope.viewAll}" var="currentcharacter">
			<tr>
				<td><input type="radio" name="id" value="${currentcharacter.id}"></td>
				<td>${currentcharacter.character}</td>
				<td>${currentcharacter.rank}</td>
				<td>${currentcharacter.actor}</td>
			</tr>
		</c:forEach>
	  </table>
	  <input type = "submit" value = "edit" name = "changeCharacter">
	  <input type = "submit" value = "delete" name = "changeCharacter">
	  <input type = "submit" value = "add" name = "changeCharacter">
  </form>
  </body>
</html>

