<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h2>Customer Configuration..............................</h2>
<hr>

The Customer is Confirmed : ${customer.firstName} ${customer.lastName}
<br><br>
The passes free is ${customer.freePasses}
<br><br>
Postal Code ${customer.postalCode}
<br><br>
Course Code ${customer.courseCode}
</body>

</html>