<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSRL fmt 라이브러리</title>
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
	<h1>1.후보자 득표율</h1>
	<table>
		<thead>
			<tr>
				<th>기호</th>
				<th>득표수</th>
				<th>득표율</th>							
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td><fmt:formatNumber value="${candidates[0] }"/></td>
				<td><fmt:formatNumber value="${candidates[0]/1000000 }" type="percent"/></td>				
			</tr>
			<tr>
				<td>2</td>
				<td><fmt:formatNumber value="${candidates[1] }"/></td>
				<td><fmt:formatNumber value="${candidates[1]/1000000 }" type="percent"/></td>				
			</tr>
			<tr>
				<td>3</td>
				<td><fmt:formatNumber value="${candidates[2] }"/></td>
				<td><fmt:formatNumber value="${candidates[2]/1000000 }" type="percent"/></td>				
			</tr>
		</tbody>
	
	
	</table>


</body>
</html>