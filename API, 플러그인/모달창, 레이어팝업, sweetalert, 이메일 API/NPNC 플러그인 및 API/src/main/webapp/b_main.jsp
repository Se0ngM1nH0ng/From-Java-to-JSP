<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@10.15.5/dist/sweetalert2.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/sweetalert2@10.15.5/dist/sweetalert2.min.css">
<script>
$(document).ready(function() {
  const modalOpenButton = document.getElementById('modalOpenButton');
  const modalCloseButton = document.getElementById('modalCloseButton');
  const modal = document.getElementById('modalWrap');
          $('#close').click(function(){
             $('#pop').hide();
          });
        

  modalOpenButton.addEventListener('click', function() {
    modal.style.display = 'block';
  });

  modalCloseButton.addEventListener('click', function() {
    modal.style.display = 'none';
  });
  PopupOpenButton.addEventListener('click', function() {
    pop.style.display = 'block';
  });

  
  alertOpenButton.addEventListener('click', function showAlert() {
      Swal.fire({
          title: 'NPNC',
           text: 'No Pain No Coder',
           imageUrl: 'img/logo2.png',
           imageWidth: 450,
           imageHeight: 250,
           imageAlt: 'Custom image',
           confirmButtonText: '확인'
         });
       });
});
</script>

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #151515;
	margin: 0;
	padding: 20px;
}

.container1 {
	max-width: 400px;
	height: 100%;
	margin: 0 auto;
	background-color: #fff ;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
	margin-top: 30px;
}

.form-label {
	font-weight: bold;
	margin-bottom: 10px;
	margin-bottom: 10px;
}

.form-input {
	width: 95%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
	margin-bottom: 20px;
}

.form-submit {
	background-color: #2E2E2E;
	color: #fff;
	border: none;
	padding: 10px 20px;
	border-radius: 3px;
	cursor: pointer;
	float: right;
	margin-bottom: 10px;
}

.form-submit:hover {
	background-color: #151515;
}

.form-link {
	color: black;
	text-decoration: none;
	margin-top: 10px;
	display: inline-block;
}

.form-link:hover {
	color: #151515;
}

.form-button {
	background-color: #2E2E2E;
	color: #fff;
	border: 1;
	padding: 10px 20px;
	border-radius: 3px;
	cursor: pointer;
	margin-top: 10px;
}

.form-button:hover {
	background-color: #151515;
}

h1 {
	font-size: 28px;
	font-weight: bold;
	color: #333;
	text-align: center;
	margin-top: 20px;
}

.logo-container {
	border-radius: 15%;
	display: flex;
	justify-content: center;
}

.rounded-logo {
	filter: drop-shadow(33px 15px 2px #2E2E2E);
}

#pop {
	wiedth: 500px;
	height: 200px;
	background: #3d3d3d;
	color: #ffffff;
	position: absolute;
	top: 100px;
	left: 100px;
	text-align: center;
	border: 2px solid #000;
}

#modalOpenButton, #modalCloseButton {
	cursor: pointer;
}

#modalWrap {
	display: none;
	position: fixed;
	z-index: 1;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgba(0, 0, 0, 0.5);
}

#modalBox {
	background-color: #ffffff;
	margin: 15% auto;
	padding: 20px;
	border: 1px solid #888;
	width: 500px;
	height: 300px;
	border-radius: 15px 15px;
}

.hidden {
	display: none;
}
 .container {
        animation: slideIn 0.8s forwards;
    }

    .slideOutRight {
        transform: translateX(100%);
    }

    @keyframes slideIn {
        from {
            transform: translateX(-100%);
        }
        to {
            transform: translateX(0);
        }
    }
  
</style>
</head>
<body>
	<button id="modalOpenButton"><font size="4px"><b>모달창 열기</b></font></button>
	<button id="PopupOpenButton"><font size="4px"><b>레이어 팝업창 열기</b></font></button>
	<button id="alertOpenButton"><font size="4px"><b>Sweet Alert 보여주기</b></font></button>

	<div id="modalWrap" class="hidden">
		<div id="modalBox">
			<p>모달창입니다.</p>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br>
			<button id="modalCloseButton">닫기</button>
		</div>
	</div>
	<div id="pop">
		<div>
			<button id="close" style="width: 200px; margin: auto;">close</button>
			<br> <br> <br> 레이어팝업 예시
		</div>
	</div>
		<script type="text/javascript">
        function check() {
            var ans = prompt('비밀번호를 입력하세요.');
            location.href = 'controller.jsp?action=mypage&mpw=' + ans;
        }
        function navigateToPage(url) {
            var container = document.querySelector('.container');
            container.style.animation = 'slideOutRight 0.3s forwards';
            setTimeout(function() {
                window.location.href = url;
            }, 300); // 애니메이션 시간 설정 (0.3초)
        }
    </script>
		<div class="logo-container">
  <img class="rounded-logo" alt="logo" src="img/logo5.png" width="350px">
</div>
	<div class="container">
<div class="container1">
    <c:if test="${empty mid}"><br>
        <form action="controller.jsp" method="post">
            <input type="hidden" name="action" value="login">
            <label class="form-label">아이디</label>
            <input type="text" name="mid" required class="form-input"><br>
            <label class="form-label">비밀번호</label>
            <input type="password" name="mpw" required class="form-input"><br>
            <input type="submit" value="로그인" class="form-submit">
        </form>
        <a href="controller.jsp?action=signupPage" class="form-link">회원가입</a>
    </c:if>

    <c:if test="${not empty mid}">
        <button onClick='check()' class="form-button">${mid}님의 마이페이지</button>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="controller.jsp?action=logout" class="form-link">로그아웃</a>
    </c:if>


    <c:if test="${not empty mid}">
        &nbsp;&nbsp;&nbsp;&nbsp;<a href='controller.jsp?action=insertemailPage' class="form-link">이메일 작성</a>
    </c:if>
</div>
</div>

</body>
</html>