<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link  href="stylesheet.css" rel="stylesheet">
</head>
<body>
	<div>
 		<div>
 			<form action = "editCharacterServlet" method = "post">
				  <div >
				    <label>Character Name: </label>
				    <input type="text"  name ="name" value = "${changeCharacter.character }">
				  </div>
				  <div >
				    <label class="form-label">Character Rank: </label>
				    <input type="text" name ="rank" value = "${changeCharacter.rank }">
				  </div>
				 	<div >
				    <label  class="form-label">Actor Name: </label>
				    <input type="text" name ="actor" value = "${changeCharacter.actor }">
				  </div>
				  <div>
				  	<input type="hidden" name = "id" value = "${changeCharacter.id }">
				  </div>
				  <input type="submit" value = "Edit Cast Member" >
			</form>
 		</div>
 	</div>
</body>
</html>