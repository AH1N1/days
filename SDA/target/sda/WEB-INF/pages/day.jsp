<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Strona glowna</title>
</head>
<body>
	<center>

		<h2>Days:</h2>
		
			<table style="border-collapse: collapse;" border="1"
				bordercolor="#006699" width="700">
				<tr bgcolor="lightblue">

					<th>Id</th>
					<th>Name</th>
					<th>Date</th>
					<th>Description</th>
				</tr>
                <c:forEach var="day" items="${SINGLE_DAY}" varStatus="status">
					<tr>
						<td><c:out value="${day.id}"></c:out></td>
						<td><c:out value="${day.name}"></c:out></td>
						<td><c:out value=""></c:out></td>
						<td><c:out value="${day.description}"></c:out></td>
					</tr>
			</c:forEach>
			</table>
	</center>
</body>
</html>