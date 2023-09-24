<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 실습</title>
<style type="text/css">
   img {
      cursor: pointer;
   }
</style>
</head>
<body>

<img id="photo" alt="실습용 이미지" src="">

<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
<script type="text/javascript">
   $("#photo").prop("src","images/짱구.jpg");
	
   
	   var num=1;
   $("#photo").on("click",function(){
	   
      $.ajax({
         url: 'test.do?check='+num,
         type: 'POST',
         success: function(result){
            console.log('result ['+result+']');
            if(result==1){
               $("#photo").prop("src","images/짱구.jpg");
               num=1;
            }else{
            	$("#photo").prop("src","images/보노보노.jpg");
            	num=2;
            }
         },
         error: function(error){
            alert('error ['+error+']');
         }
      });
   });
</script>

</body>
</html>


