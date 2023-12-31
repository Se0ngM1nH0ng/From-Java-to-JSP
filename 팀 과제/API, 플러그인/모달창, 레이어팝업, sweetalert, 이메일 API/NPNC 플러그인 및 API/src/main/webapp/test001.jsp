<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<style type="text/css">
@charset "utf-8";

/* 전체 컨텐츠 길이 */
.content{
    height: 3000px;
}

/* 전체를 감싸고 있는 div에 fixed 부여 함으로 써 content의 길이가 길어져도 dimmed가 배경에 100% 깔릴 수 있게 함 */
.layer_popup{
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
}
/* absolute / margin 을 통한 화면 정중앙 정렬 및 디자인*/
.layer{
    width: 500px;
    height: 250px;
    background-color: #fff;
    border: 1px solid #e5e5e5;
    position: absolute;
    top: 0;
    left: 0;
    bottom: 0;
    right: 0;
    margin: auto;
    border-radius: 5px;
    box-shadow: 0 0 10px -4px;
}
/* 전체 글 부분 패딩값 조절 */
.text_area{
    padding: 50px 30px 0;
}
/* 텍스트 부분 스타일 */
.text_area > p{
    font-size: 17px;
    line-height: 1.5;
    text-align: justify;
}
/* 버튼 table로 넓이 조절 */
.btn_area{
    padding: 30px;
    display: table;
    table-layout: fixed;
    width: 100%;
    box-sizing: border-box;
}
/* 버튼 디자인 및 table-cell로 넓이 조절 */
.btn_area > button{
    border: 1px solid;
    padding: 13px 18px;
    color: #fff;
    font-size: 18px;
    background-color: gray;
    box-sizing: border-box;
    display: table-cell;
    width: 45%;
    margin-right: 2.5%;
    cursor: pointer;
    box-shadow: 0px 0px 8px -5px #000;
}
/* twitter 넓이 / 색상 */
.btn_area > .btn_twitter{
    width: 25%;
    background-color: #00acee;
}
/* Dribbble 넓이 / 색상 */
.btn_area > .btn_Dribbble{
    width: 25%;
    background-color: #ff7b89;
    margin: 0;
}
/* 닫기 버튼  디자인 및 위치 조절*/
.btn_close{
    border: none;
    font-size: 15px;
    width: 80px;
    height: 25px;
    background: transparent;
    position: absolute;
    top: 10px;
    right: 10px;
    cursor: pointer;
    font-weight: bold;
}
/* 딤드 처리 */
.dimmed{
    background-color: rgba(0, 0, 0, 0.3);
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    z-index: -1;
}
</style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="pop.css">
    <link rel="stylesheet" href="../reset.css">
    <title>팝업</title>
</head>
<body>
    <div class="content"></div>
    <h1>asdfasdfasdfasdf</h1>
	<button>test</button>
    <div class="layer_popup">
        <div class="layer">
            <div class="text_area">
                <p>
                    So implement your design and place content here! If you want to close modal, please hit "Esc", click somewhere on the cereen or use special button.
                </p>
            </div>
            <div class="btn_area">
                <button class="btn_git">Avgrund on Github</button>
                <button class="btn_twitter">Twitter</button>
                <button class="btn_Dribbble">Dribbble</button>
            </div>
            <button class="btn_close">CLOSE</button>
        </div>

        <div class="dimmed"></div>

    </div>
</body>
</html>