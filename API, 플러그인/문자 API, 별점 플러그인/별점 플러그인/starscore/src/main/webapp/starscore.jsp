<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>별점</title>
  <script defer src="star.js">
  
  </script>
  <link rel="stylesheet" href="starscorecss.css">

</head>

<body>



  <div class="rating_box">
  <form action="controller.jsp" method="post">
      <input type="hidden" name="action" value="save">
    <div class="rating">
      ★★★★★
      <span class="rating_star">★★★★★</span>
      <input type="range" name="inputValue" value="0" step="1" min="0" max="10">
    </div>
    <br>
    <input type="submit" value="저장">  
  </form>
  </div>

</body>

</html>