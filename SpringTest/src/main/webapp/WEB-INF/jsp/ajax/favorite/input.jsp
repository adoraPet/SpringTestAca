<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가</title>
<script
  src="https://code.jquery.com/jquery-3.6.4.min.js"
  integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
  crossorigin="anonymous"></script>
</head>
<body>

	<h3>즐겨찾기 추가하기</h3>
	<label>제목</label><input type="text" name="name" id="nameInput"><br>
	<label>주소</label><input type="text" name="address" id="addressInput">
	<button type="button" id="duplicateBtn">중복확인</button><br>
	<button type="button" id="addBtn">추가</button>
	
	<script>
		$(document).ready(function(){
			$("#duplicateBtn").on("click",function(){
				let address = $("#addressInput").val();
				if(address == ""){
					alert("주소를 입력하세요");
					return ;
				}
					$.ajax({
					
					type:"get"
					, url:"/ajax/favorite/is_duplicate"
					, data:{"address":address}
					, success:function(data){
						if(data.is_duplicate == "true"){
							//중복된 경우
							alert("중복되었습니다.");
						} else {
							//중복이 안된 경우
							alert("사용가능한 이메일 입니다.");
						}
					}
					, error:function(){
						alert("중복확인 에러");
					}
				});
			});
			
			$("#addBtn").on("click", function(){
				let name = $("#nameInput").val();
				let address = $("#addressInput").val();
				
				
				if(name == ""){
					alert("제목을 입력하세요");
					return ;//false를 추가해야 수행이 계속 진행되지 않고 중단된다
				}
				if(address == ""){
					alert("주소를 입력하세요");
					return ;
				}
				if(!url.startsWith("https://") && !url.startsWith("http://")){
					alert("주소 형식이 잘못되었습니다.");
					return;
				}
			
				
				$.ajax({
					type:"post"
					, url:"/ajax/favorite/add"
					, data:{"name":name, "address":address}
					, success:function(data){
						if(data.result == "success"){
							//리스트 페이지로 이동
							location.href = "/ajax/favorite/list";
						} else {
							alert("추가 실패");
						}
					}
					
					,error:function(){
						alert("추가 에러");	
					}
					
				});
			});
		});
				
				
	
	
	</script>
</body>
</html>