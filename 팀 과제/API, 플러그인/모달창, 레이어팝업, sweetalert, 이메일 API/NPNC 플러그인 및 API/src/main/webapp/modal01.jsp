<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모달창 예시</title>

<style type="text/css">
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
  width: 300px;
  border-radius: 15px 15px;
}

.hidden {
  display: none;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<script>
$(document).ready(function() {
  const modalOpenButton = document.getElementById('modalOpenButton');
  const modalCloseButton = document.getElementById('modalCloseButton');
  const modal = document.getElementById('modalWrap');

  modalOpenButton.addEventListener('click', function() {
    modal.style.display = 'block';
  });

  modalCloseButton.addEventListener('click', function() {
    modal.style.display = 'none';
  });
});
</script>

</head>
<body>

<button id="modalOpenButton">모달창 열기</button>

<div id="modalWrap" class="hidden">
  <div id="modalBox">
    <p>모달창입니다.</p>
    <button id="modalCloseButton">닫기</button>
  </div>
</div>



</body>
</html>