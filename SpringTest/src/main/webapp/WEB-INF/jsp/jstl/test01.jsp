<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL Core</h1>
	<h2>1.변수 만들기</h2>
	<%-- int number1 = 100; --%>
	<c:set var="number1" value="36" />
	<c:set var="number2">3</c:set>
	
	<h4>첫번째 숫자 : ${number1 }</h4>
	<h4>두번째 숫자 : ${number2 }</h4>
	
	<h2>2.연산하기</h2>
	<h3>위에서 만든 두개의 변수의 사칙 연산 결과를 아래와 같이 출력하세요.</h3>
	<h4>더하기 : ${number1 + number2 }</h4>
	<h4>빼기 : ${number1 - number2 }</h4>
	<h4>곱하기 : ${number1 * number2 }</h4>
	<h4>나누기 : ${number1 / number2 }</h4>
	
	<h2>3.JSTL core out</h2>
	<c:out value="<title>core out</title>"/>
	
	<h2>4.JSTL core if</h2>
	<c:set var="average" value="${(number1 + number2) / 2 }"/>
	<c:if test="${(number1 + number2) / 2 >= 10}">
		<h1><c:out value="${(number1 + number2)/2}"/></h1>
	</c:if>
	
	<h1>5.core if</h1>
	<c:if test="${number1 * number2 > 100}">
		<c:out value="<script>alert('너무 큰 수 입니다.')</script>" escapeXml="false"/>
	</c:if>
	
	

</body>
</html>