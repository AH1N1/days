<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Strona glowna</title>
</head>
<body>
	<center>

		<h2>Hello:</h2>
		
			<table style="border-collapse: collapse;" border="1"
				bordercolor="#006699" width="700">
				<tr bgcolor="lightblue">
					<th>Lp</th>
					<th>Id</th>
					<th>Text</th>
				</tr>
				<c:forEach var="hello" items="${ALL_HELLO}" varStatus="status">
					<tr>
						<td><c:out value="${status.index+1}"></c:out></td>
						<td><c:out value="${hello.id}"></c:out></td>
						<td><c:out value="${hello.text}"></c:out></td>
					</tr>
			</c:forEach>
			</table>
	</center>
</body>
</html>