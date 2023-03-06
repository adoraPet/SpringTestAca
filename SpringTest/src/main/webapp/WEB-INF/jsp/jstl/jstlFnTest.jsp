<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 리스트</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>No</th>
				<th>이름</th>	
				<th>전화번호</th>	
				<th>국적</th>	
				<th>이메일</th>	
				<th>자기소개</th>	
			</tr>
		</thead>
		<tbody>
			<c:forEach var="member" items="${memberList}">
			<tr>
				<td>${member.no }</td>
				<td>${member.name }</td>
				<c:choose>
				<c:when test="${fn:startsWith(member.phoneNumber, '010') }">
				<td>${member.phoneNumber }</td>
				</c:when>
				<c:otherwise>
				<td>유효하지 않은 전화번호</td>
				</c:otherwise>
				</c:choose>
				<td>${fn:replace(member.nationality, "삼국시대", "삼국-" )}</td>
				<td><b>${fn:split(member.email,"@")[0] }</b>@${fn:split(member.email,"@")[1]}</td>
				<td>${fn:substring(member.introduce,0,15)}
					<c:if test="${fn:length(member.introduce) > 15 }">
						...
					</c:if></td>
			</tr>
			</c:forEach>
		</tbody>
	
	
	</table>

</body>
</html>