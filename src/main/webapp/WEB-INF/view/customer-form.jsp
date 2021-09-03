<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!Doctype html>
<head>
	<title>Hello Customer - Registration Form</title>

  <style>
    .error {color: red};
  </style>
</head>
<html>
	<body>
    <h2>Feel free to register!</h2>
		<hr />
      <form:form action="/customer/process" modelAttribute="customer">
        First name: <form:input path="firstName" />

        <br><br>

        Last name (*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <br><br>

        Free passes (*): <form:input type="number" path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />

        <br><br>

        Postal code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error" />

        <br><br>

        <input type="submit" value="submit" />
      </form:form>
    <br />
    <h3>current time: <span id="show-date"></span></h3>
    <script type="text/javascript" src="../js/index.js"></script>
	</body>
</html>