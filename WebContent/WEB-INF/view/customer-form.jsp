<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration Form</title>
	<style> 
	.error{
	color:red
	}
	</style>
</head>

<body>

<i> Fill out the form . Asterisk (*) means required </i>
	<form:form action="processForm" modelAttribute="customer" >
	
		    First name : <form:input path="firstName" placeholder="What's your First name?" />
			<br><br>
			Last name(*) : <form:input path="lastName" placeholder="What's your Last name?"  />
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			Free passes : <form:input path="freePasses" placeholder="Enter your number"  />
			<form:errors path="freePasses" cssClass="error"/>
			<br><br>
		    Postal Code: <form:input path="postalCode" placeholder="Enter your Postal Code"  />
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			Course Code: <form:input path="courseCode" placeholder="Enter your course Code"  />
			<form:errors path="courseCode" cssClass="error"/>
			<br><br>
			Course Code: <form:input path="courseCodes" placeholder="Enter your course Code"  />
			<form:errors path="courseCodes" cssClass="error"/>
			<br><br>
		<input type="submit" value="submit" />
			
			
			
			
			
	</form:form>

</body>

</html>