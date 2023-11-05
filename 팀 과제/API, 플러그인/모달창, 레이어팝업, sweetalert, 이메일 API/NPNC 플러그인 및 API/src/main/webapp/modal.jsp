<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모달창 예시</title>

<style type="text/css">

body{
   background-color: #BBD0FF;
}

#modalOpenButton{
  border-radius: 100%;
   width: 180px;
  height: 180px;
  cursor: pointer;
  border: 3px dashed #FFFFFF;
  background-color: #B8C0FF;
}
#popupOpenButton{
  border-radius: 100%;
   width: 180px;
  height: 180px;
  cursor: pointer;
  border: 3px dashed #FFFFFF;
  background-color: #B8C0FF;
}
#alertOpenButton{
  border-radius: 100%;
   width: 180px;
  height: 180px;
  cursor: pointer;
  border: 3px dashed #FFFFFF;
  background-color: #B8C0FF;
}

#modalCloseButton{
   width: 50px;
    height: 30px;
   cursor: pointer;
   float: left;
   background-color:#C8B6FF;
}
#modalCloseButton2{
   width: 50px;
  height: 30px;
   cursor: pointer;
   float: right;
   background-color:#C8B6FF;
}
#popupCloseButton{
   width: 50px;
  height: 30px;
   cursor: pointer;
   float: right;
   background-color:#C8B6FF;
}

#modalWrap {
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
}
#modalWrap2 {
  display: none;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: #FFD6FF;
}
#modalbtn {
   text-align: center;
   margin-top: 20%;
}

#modalBox {
  background-color: #E7C6FF;
  margin: 15% auto;
  padding: 20px;
  border: 2px solid #FFFFFF;
  width: 400px;
  height: 80px;
  border-radius: 15px;
  text-align: center;
}

.hidden {
  display: none;
}
</style>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@10.15.5/dist/sweetalert2.min.css">

</head>
<body>
<div id="modalbtn">
<button id="modalOpenButton"><font size="4px"><b>모달창 보여주기</b></font></button>
<button id="popupOpenButton"><font size="4px"><b>팝업창 보여주기</b></font></button>
<button id="alertOpenButton" onclick="showAlert()"><font size="4px"><b>알림창 보여주기</b></font></button>
</div>

<div id="modalWrap" class="hidden">
  <div id="modalBox">
    <p><b>이게 바로 모달창 유갓잇?</b></p>
    <button id="modalCloseButton"><b>갓 잇</b></button>
    <button id="modalCloseButton2"><b>레 고</b></button>
  </div>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10.15.5/dist/sweetalert2.min.js"></script>
<script>
$(document).ready(function() {
  const popupOpenButton = document.getElementById('popupOpenButton');
  const modalOpenButton = document.getElementById('modalOpenButton');
  const modalCloseButton = document.getElementById('modalCloseButton');
  const modalWrap = document.getElementById('modalWrap');
  const modal = document.getElementById('modalWrap');
  const modal2 = document.getElementById('modalWrap2');

  popupOpenButton.addEventListener('click', function() {
     location.href="popup.jsp";
  });
  modalOpenButton.addEventListener('click', function() {
    modal.style.display = 'block';
  });
  modalCloseButton.addEventListener('click', function() {
    modal.style.display = 'none';
  });
  modalWrap.addEventListener('click', function() {
    modal.style.display = 'none';
  });
  modalCloseButton2.addEventListener('click', function() {
   location.href="a_index.jsp";
    modal.style.display = 'none';
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

</body>
</html>