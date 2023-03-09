<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 리스트</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>NO.</th>
				<th>이름</th>
				<th>주소</th>			
			</tr>	
		</thead>
		<tbody>
			<c:forEach var="favorite" items="${favoriteList }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${favorite.name }</td>
				<td>${favorite.address }</td>
			</tr>
			</c:forEach>
		</tbody>
	
	
	</table>

</body>
</html>