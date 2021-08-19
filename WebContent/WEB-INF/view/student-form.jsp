<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Hello World - Input Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student" >
	
		First name : <form:input path="firstName"
			placeholder="What's your First name?" />
			<br><br>
			Last name : <form:input path="lastName"
			placeholder="What's your Last name?" />
			<br><br>
			<form:select path="country">
			
			<!-- "by the class object" <form:options items="${student.countryOption}"/> -->
			
			<!-- by the properties class -->
			<form:options items="${modelCountryOptions}"/>
			</form:select>
			<br><br>
			
			Favorite Language:
			
			<!-- by writing direct radio button java <form:radiobutton path="favoriteLanguage" value="java"/>  -->
			
			
			 <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
		
			
			<br><br>
			
			Operating Systems :  
			<form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
			<form:checkbox path="operatingSystems" value="Mac Os" label="Mac Os"/>
			<form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
			<br><br>
		<input type="submit" value="submit" />
			
			
			
			
			
	</form:form>

</body>

</html>