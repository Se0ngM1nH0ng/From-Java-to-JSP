<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link rel="stylesheet" href="css/styles.css">
<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 20px;
			background-color: #151515;
		}

		.container {
			max-width: 400px;
			margin: 0 auto;
			background-color: #fff;
			border-radius: 5px;
			padding: 20px;
			box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
			margin-top: 30px;
			opacity: 0; /* 초기에 투명하게 설정 */
			transform: scale(1); /* 초기에 축소되어 보이도록 설정 */
       		transition: opacity 0.5s ease; /* 페이드인/페이드아웃 효과 설정 */
		}
  @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }
		h2 {
			text-align: center;
			margin-bottom: 20px;
		}
  	.container.fade-in {
        opacity: 1; /* 페이드인 시 투명도 조정 */
        transform: scale(1); /* 원래 크기로 확대되도록 설정 */
    }
    
		label {
			display: block;
			margin-bottom: 10px;
			font-weight: bold;
		}

		input[type="text"],
		input[type="password"] {
			width: 100%;
			padding: 10px;
			border-radius: 5px;
			border: 1px solid #ccc;
			margin-bottom: 15px;
			box-sizing: border-box;
		}

		input[type="submit"] {
			background-color: #2E2E2E;
			color: white;
			padding: 12px 20px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			width: 100%;
		}

		input[type="submit"]:hover {
			background-color: #151515;
		}

		.link {
			display: block;
			margin-top: 10px;
			text-align: center;
			color: #777;
		}
		
	</style>
	<script type="text/javascript">
    function navigateToPage(url) {
        var container = document.querySelector('.container');
        container.classList.remove('fade-in'); // 페이드인 효과 제거
        setTimeout(function() {
            window.location.href = url;
        }, 500); // 애니메이션 시간 설정 (0.5초)
    }
    window.addEventListener('DOMContentLoaded', function() {
        var container = document.querySelector('.container');
        container.classList.add('fade-in');
    });
</script>
</head>
<body>
<div class="container">
		<h2>회원가입</h2>

		<form action="controller.jsp" method="post">
			<input type="hidden" name="action" value="signup">

			<label for="mid">아이디</label>
			<input type="text" name="mid" id="mid" required>

			<label for="mpw">비밀번호</label>
			<input type="password" name="mpw" id="mpw" required>

			<label for="name">이름</label>
			<input type="text" name="name" id="name" placeholder="회원이름" required>

			<label for="email">이메일</label>
			<input type="text" name="email" id="email" placeholder="이메일" required>

			<input type="submit"  value="회원가입">
		</form>

		 <a href="javascript:void(0);" onclick="navigateToPage('controller.jsp?action=main')" class="form-link">메인으로 돌아가기</a>
	</div>
</body>
</html>