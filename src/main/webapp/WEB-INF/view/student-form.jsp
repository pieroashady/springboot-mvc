<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!Doctype html>
<head>
	<title>Hello Student - Registration Form</title>
</head>
<html>
	<body>
    <h2>Feel free to register!</h2>
		<hr />
      <form:form action="/student/process" modelAttribute="student">
        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />

        <br><br>

        Country:

        <form:select path="country">
          <%-- <form:option value="Indonesia" label="Indonesia" />
          <form:option value="Indonesia 2" label="Indonesia 2" />
          <form:option value="Indonesia 3" label="Indonesia 3" /> --%>
          <form:options items="${student.countryOptions}" />
        </form:select>

        <br><br>

        Favorite language:

        <br>

        <%-- <form:radiobutton path="favoriteLanguage" value="Java" /> Java
        <br>
        <form:radiobutton path="favoriteLanguage" value="JavaScript" /> JavaScript
        <br>
        <form:radiobutton path="favoriteLanguage" value="PHP" /> PHP
        <br>
        <form:radiobutton path="favoriteLanguage" value="C#" /> C# --%>

        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages}" />

        <br><br>

        Favorite OS:

        <br>

        <%-- <form:checkbox path="favoriteOS" value="Windows" /> Windows
        <br>
        <form:checkbox path="favoriteOS" value="Linux" /> Linux
        <br>
        <form:checkbox path="favoriteOS" value="Mac OS" /> MacOS --%>

        <form:checkboxes path="favoriteOS" items="${student.favoriteOSOptions}" />

        <br><br>

        <input type="submit" value="submit" />
      </form:form>
    <br />
    <h3>current time: <span id="show-date"></span></h3>
    <script type="text/javascript" src="../js/index.js"></script>
	</body>
</html>