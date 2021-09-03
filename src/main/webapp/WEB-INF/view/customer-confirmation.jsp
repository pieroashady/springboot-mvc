<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="collection" %>

<!Doctype html>
<html>
<head>
  <title>Customer confirmation</title>
</head>
	<body>
		<h3>Our handsome confirmed customer!</h3>
		<h3>Name: ${customer.firstName} ${customer.lastName}</h3>
		<h3>Free passes: ${customer.freePasses}</h3>
		<h3>Postal code: ${customer.postalCode}</h3>
    <%-- <h3>Fav OS:</h3>
    <ul>
      <collection:forEach var="favOS" items="${student.favoriteOS}">
        <li>${favOS}</li>
      </collection:forEach>
    </ul> --%>
	</body>
</html>