<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="collection" %>

<!Doctype html>
<html>
<head>
  <title>Student confirmation</title>
</head>
	<body>
		<h3>Our handsome confirmed student!</h3>
		<h3>Name: ${student.firstName} ${student.lastName}</h3>
    <h3>Country: ${student.countryOptionsValue}</h3>
    <h3>Favorite language: ${student.favoriteLanguage}</h3>
    <h3>Fav OS:</h3>
    <ul>
      <collection:forEach var="favOS" items="${student.favoriteOS}">
        <li>${favOS}</li>
      </collection:forEach>
    </ul>
	</body>
</html>