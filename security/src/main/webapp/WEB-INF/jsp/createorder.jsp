<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>Place Order</title>
</head>
<body>
<%-- <c:url var="addOrder" value="/order/create" ></c:url> --%>
<form name="order" method="post" action="/order/create">
<table>
<tr>
			<td><form:label path="username">
				<spring:message text="Username"/>
			</form:label></td>
		
			<td><form:input type="text" path="username"   /></td>
			</tr>
			<tr>
			<td><form:label path="emailId">
				<spring:message text="Email Id"/>
			</form:label></td>
		
			<td><form:input type="text" path="emailId"   /></td>
			</tr>
			<tr>
			<td><form:label path="item">
				<spring:message text="Item"/>
			</form:label></td>
		
			<td><form:input type="text" path="item"   /></td>
			</tr>
			<tr>
			<input type="submit"
					value="<spring:message text="Add Order"/></tr>
			</table>
</form>
</body>
</html>