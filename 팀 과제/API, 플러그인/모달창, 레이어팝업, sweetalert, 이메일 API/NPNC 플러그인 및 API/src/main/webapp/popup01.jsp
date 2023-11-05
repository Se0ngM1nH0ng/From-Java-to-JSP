<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>레이어 팝업 JSP 예제</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h1>레이어 팝업 JSP 예제</h1>
  
  <button onclick="openPopup()">팝업 열기</button>
  
  <div id="popup" class="popup">
    <div class="popup-content">
      <h2>레이어 팝업</h2>
      <p>팝업 내용입니다.</p>
      <button onclick="closePopup()">닫기</button>
    </div>
  </div>
  
  <script>
    function openPopup() {
      document.getElementById("popup").style.display = "block";
    }
    
    function closePopup() {
      document.getElementById("popup").style.display = "none";
    }
  </script>
</body>
</html>