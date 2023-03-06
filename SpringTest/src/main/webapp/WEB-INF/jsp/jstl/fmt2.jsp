<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		body {
 		 	background-color: #F9EBEA;
  			font-family: Arial, sans-serif;
		}
		table {
		  width: 80%;
		  max-width: 500px;
		  margin: 20px auto;
		  border-collapse: collapse;
		  border: 2px solid #F44336;
		  border-radius: 10px;
		  box-shadow: 5px 5px 5px #888888;
		}
		h1 {
		  text-align: center;
		  font-size: 36px;
		  color: #F44336;
		}
		
		th, td {
		  padding: 10px;
		  text-align: left;
		  border-bottom: 2px solid #F44336;
		}
		
		th {
		  background-color: #F44336;
		  color: white;
		  font-size: 20px;
		}
	</style>
</head>
<fmt:formatNumber value="${candidates[0] }" var="no1"/>
<fmt:formatNumber value="${candidates[1] }" var="no2"/>
<fmt:formatNumber value="${candidates[2] }" var="no3"/>
<body>
	<h1>2. 카드 명세서</h1>
	<table>
		<thead>
			<tr>
				<th>사용처</th>
				<th>가격</th>
				<th>사용날짜</th>							
				<th>할부</th>							
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${cardBills[0].store }</td>
				<td><fmt:formatNumber value="${cardBills[0].pay }" type="currency" currencySymbol="$"/></td>
				<fmt:parseDate value="${cardBills[0].date }" pattern="yyyy-MM-dd" var="date"/>
				<td><fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일"/></td>
				<td>${cardBills[0].installment }</td>				
			</tr>
			<tr>
				<td>${cardBills[1].store }</td>
				<td><fmt:formatNumber value="${cardBills[1].pay }" type="currency" currencySymbol="$"/></td>
				<fmt:parseDate value="${cardBills[1].date }" pattern="yyyy-MM-dd" var="date"/>
				<td><fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일"/></td>
				<td>${cardBills[1].installment }</td>				
			</tr>
			<tr>
				<td>${cardBills[2].store }</td>
				<td><fmt:formatNumber value="${cardBills[2].pay }" type="currency" currencySymbol="$"/></td>
				<fmt:parseDate value="${cardBills[2].date }" pattern="yyyy-MM-dd" var="date"/>
				<td><fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일"/></td>
				<td>${cardBills[2].installment }</td>				
			</tr>
		</tbody>
	
	
	</table>
</body>
</html>