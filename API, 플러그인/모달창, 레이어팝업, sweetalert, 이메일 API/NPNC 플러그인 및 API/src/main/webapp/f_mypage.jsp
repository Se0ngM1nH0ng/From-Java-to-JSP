<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: black;
        margin: 0;
        padding: 20px;
    }

    .container {
        max-width: 400px;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    .form-label {
        font-weight: bold;
        margin-bottom: 10px;
    }

    .form-input {
        width: 95%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
        margin-bottom: 20px;
    }

    .form-button {
        background-color: #2E2E2E;
        color: #fff;
        border: none;
        padding: 10px 20px;
        border-radius: 3px;
        cursor: pointer;
        margin-top: 10px;
    }

    .form-button:hover {
        background-color:#151515;
    }

    .form-link {
        color: #2E2E2E;
        text-decoration: none;
        margin-top: 10px;
        display: inline-block;
    }
</style>
</head>
<body>

<div class="container">
    <script type="text/javascript">
        function remove() {
            var ans = confirm("정말로 탈퇴하시겠습니까???");
            if (ans == true) {
                document.form.action.value = 'deleteMember';
                document.form.submit();
            }
        }
    </script>

    <form name='form' action="controller.jsp" method="post">
        <input type="hidden" name="action" value="updateMember">
        <label class="form-label">아이디</label>
        <input type="text" name="mid" readonly value='${data.mid}' class="form-input"><br>
        <label class="form-label">비밀번호</label>
        <input type="password" name="mpw" value='${data.mpw}' class="form-input"><br>
        <label class="form-label">이름</label>
        <input type="text" name="name" value='${data.name}' class="form-input"><br>
        <input type="submit" value="회원정보변경" class="form-button">
        <input type="button" value="회원탈퇴" onClick='remove()' class="form-button">
    </form>

    <br>

    <a href="controller.jsp?action=main" class="form-link">메인으로 돌아가기</a>
</div>

</body>
</html>