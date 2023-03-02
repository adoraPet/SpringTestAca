<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매자 입력</title>
</head>
<body>

	<h1>판매자 정보</h1>
	<form method="post" action="/jsp/test01/add_seller"><br>
	<label>닉네임</label>
	<input type="text" name="nickname"><br>
	<label>프로필 사진url</label>
	<input type="text" name="profileImage"><br>
	<label>온도</label>
	<input type="text" name="temperature">
	<button type="submit">추가</button>
	</form>
	
	<form method="post" action="/jsp/test01/lastSeller">
	
	
</body>
</html>