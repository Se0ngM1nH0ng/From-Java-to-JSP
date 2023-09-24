<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>팝업창 예제</title>
  <style>
    /* 팝업 스타일 */
    .popup {
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      width: 300px;
      padding: 20px;
      background-color: #E7C6FF;
      border: 1px solid #FFFFFF;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      border-radius: 15px;
      z-index: 9999;
    }
    /* 배경 스타일 */
    .overlay {
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-color: #FFD6FF;
      z-index: 9998; 
    }
   #btn{
   background-color:#B8C0FF;
      float:right;
   }
  </style>
</head>
<body>
  <!-- 팝업 내용 -->
  <div id="popup" class="popup">
    <h2>이게 바로 팝업창 유갓잇?</h2>
    <button id="btn" onclick="closePopup()"><b>💕💕💕</b></button>
  </div>

  <!-- 배경 -->
  <div id="overlay" class="overlay"></div>

  <script>
    function closePopup() {
      document.getElementById("popup").style.display = "none";
      document.getElementById("overlay").style.display = "none";
      location.href="modal.jsp";
    }
  </script>
</body>
</html>