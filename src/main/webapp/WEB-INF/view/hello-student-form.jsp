<!Doctype html>
<head>
	<title>Hello World - Input Form</title>
</head>
<html>
	<body>
    <h2>Feel free to register!</h2>
		<hr />
		<form action="/hello-student/process-v3" method="get">
			<input type="text" name="studentName" placeholder="What's your name?" />
			<input type="submit"/>
		</form>
    <br />
    <h3>current time: <span id="show-date"></span></h3>
    <script type="text/javascript" src="../js/index.js"></script>
	</body>
</html>