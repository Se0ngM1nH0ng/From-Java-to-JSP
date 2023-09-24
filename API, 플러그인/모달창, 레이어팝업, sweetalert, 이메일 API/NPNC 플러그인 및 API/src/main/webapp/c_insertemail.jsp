<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 작성 페이지</title>
<style type="text/css">
	body {
        font-family: Arial, sans-serif;
        background-color: #151515;
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

    .form-textarea {
        width: 95%;
        height: 200px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
        resize: vertical;
        margin-bottom: 20px;
    }

    .form-submit {
        background-color: #2E2E2E;
        color: #fff;
        border: none;
        padding: 10px 20px;
        border-radius: 3px;
        cursor: pointer;
    }

    .form-submit:hover {
        background-color: #151515;
    }

    .form-link {
        color: #151515;
        text-decoration: none;
        margin-top: 10px;
        display: inline-block;
    }
</style>
</head>
<body>
<div class="container">
    <form action="controller.jsp" method="post">
        <input type="hidden" name="action" value="insertemail">
        <label class="form-label">제목</label>
        <input type="text" name="title" class="form-input"><br>
        <hr>
        <label class="form-label">내용</label>
        <textarea rows="10" cols="30" name="content" class="form-textarea"></textarea><br>
        <label class="form-label">수신인</label>
        <input type="text" name="receiver" class="form-input"><br>
        <input type="submit" value="이메일 작성" class="form-submit">
    </form>
    <br>
    <a href="controller.jsp?action=main" class="form-link">돌아가기</a>
</div>
</body>
</html>