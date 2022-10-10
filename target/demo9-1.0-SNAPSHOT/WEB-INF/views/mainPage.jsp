<%--
  Created by IntelliJ IDEA.
  User: lazer
  Date: 28.09.2022
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <link rel="stylesheet" type="text/css" href="css/style.css" />--%>
    <link rel="stylesheet" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#accordion" ).accordion();
        } );
    </script>
    <style>

        input::-webkit-input-placeholder {
            color: #B6C0A5;
            font-style: italic;
            background: #E0EFCA;
        }
        input:-moz-placeholder {
            color: #B6C0A5;
            font-style: italic;
            background: #E0EFCA;
        }
        input:-ms-input-placeholder {
            color: #B6C0A5;
            font-style: italic;
            background: #E0EFCA;
        }
        #right {
            float: right;
            padding-right: 20px;
        }

        #test {
            background: url(https://images.pexels.com/photos/3728084/pexels-photo-3728084.jpeg?auto=compress&cs=tinysrgb&w=1600) no-repeat;
            -moz-background-size: 100%; /* Firefox 3.6+ */
            -webkit-background-size: 100%; /* Safari 3.1+ и Chrome 4.0+ */
            -o-background-size: 100%; /* Opera 9.6+ */
            background-size: 100%;
            color: whitesmoke; /* Цвет текста */
            width: 100%;
        }
        /* Links border-bottom: 1px dotted #333333; */

        a { text-decoration: none; font-weight: bold;

            display:flex;
            justify-content:space-around;
            align-items:center;
            flex-wrap:wrap;

            /*Чтобы ничего не слиплось*/
            display:inline-block;
            padding:10px;
            float: right;
        }
        h1 {
            color: #81a2c3;
        }

        a:link { color: #567ec4; border-bottom-color: #567ec4;}

        a:visited { color: #81a2c3; border-bottom-color: #81a2c3; }

        a:hover, a:active { color: #cc3333; border-bottom-style: solid; border-bottom-color: #cc3333; }
        /* Lists */

        ul, ol, dl
        {
            margin: 15px 25px;
            line-height: 2.0em;
        }

        ol { margin-left: 30px; }

        ul { list-style-type: square; }
        /* Navigation */

        #navigation ul { margin: 0; padding: 0; list-style-type: none; float: left; }

        #navigation li { float: left; }

        #navigation a
        {
            float: right;
            display: block;
            color: #567ec4;
            padding: 5px 5px;
            border-bottom-width: 0;
        }

        #navigation a:hover, #navigation a:active
        {
            color: #000000;
        }

        #navigation li.active a
        {
            color: #000000;
        }
        #div {
            width: auto;
            height: 40px;
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            /*margin-bottom: 100px;*/
            /*margin: 80px;*/
            opacity: 0.8;
            background: ghostwhite; /* Цвет фона */
            padding: 10px; /* Поля вокруг текста */


        }
        #footer {

            position: fixed; /* Фиксированное положение */
            left: 0; bottom: 0; /* Левый нижний угол */
            padding: 10px; /* Поля вокруг текста */
            background: whitesmoke; /* Цвет фона */
            color: #fff; /* Цвет текста */
            width: 100%; /* Ширина слоя */
            height: 40px;
            opacity: 0.8;
            color:#567ec4;
            font-size: 15px;
            /*font-style: italic;*/
            font-weight: bold;
            display:flex;
            justify-content:space-around;
            align-items:center;
            flex-wrap:wrap;
        }
        #header{
            position: absolute; /* Фиксированное положение */
            left: 0; bottom: 110px; /* Левый нижний угол */
            padding: 10px; /* Поля вокруг текста */
            background: whitesmoke; /* Цвет фона */
            color: #fff; /* Цвет текста */
            /*width: 50%; !* Ширина слоя *!*/
            height: 40px;
            opacity: 0.8;
            color:#567ec4;
            font-size: 15px;
            /*font-style: italic;*/
            font-weight: bold;
            display:flex;
            justify-content:center;
            align-items:center;
            /*flex-wrap:wrap;*/
            top:82%;
            left:45%;
            right: 45%;
        }

        #center {

            position: fixed; /* Фиксированное положение */
            left: 0; bottom: 0; /* Левый нижний угол */
            padding: 10px; /* Поля вокруг текста */
            background: whitesmoke; /* Цвет фона */
            color: #fff; /* Цвет текста */
            width: 100%; /* Ширина слоя */
            height: 40px;
            opacity: 0.8;
            color:#567ec4;
            font-size: 15px;
            /*font-style: italic;*/
            font-weight: bold;
            display:flex;
            justify-content:space-around;
            align-items:center;
            flex-wrap:wrap;
        }
        /*!*div { box-sizing: border-box;*!*/

        /*}*/
        .my_boks {
            position: fixed;
            /*width: 60%;*/
            display: block;
            margin: 0 auto;
            /*padding: 0;*/
            text-align: center;
            /*Чтобы ничего не слиплось*/
            /*margin-right: 60px;*/
            /*margin-left: 60px;*/

            top:12%;
            left:20%;
            right: 20%;

            display:inline-block;
            /*padding:10px;*/
        }
        .my_boks1, .my_boks2, .my_boks3 {
            margin: 10px;
            padding: 50px 60px;
            width: calc(22% - 40px);
            display: inline-block;
            opacity: 0.8;
        }
        .my_boks1 { background-color: whitesmoke; border: 3px; }
        .my_boks2 { background-color: whitesmoke; border: 3px; }
        .my_boks3 { background-color: whitesmoke; border: 3px; }


         img{
            position: -ms-device-fixed;
            margin-top: -20px;
            width: 70px;
            height: 90px;
            /*margin-left: 0px;*/
            margin-right: 60px;
            margin-bottom: 10px;

        }

    </style>
    <title>the BOOK</title>


    <h1>the BOOK</h1>
<br>

<%--    <div id="navigation">--%>
<%--        <ul>--%>
<%--            <li><a href="#">Home</a></li>--%>
<%--            <li><a href="#about/">About</a></li>--%>
<%--            <li><a href="#contact/">Contact</a></li>--%>
<%--            <li><a href="LoginServlet">Вход</a></li>--%>
<%--            <li><a href="RegisterServlet">Регистрация</a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>

    <div id="div">
        <a href="MainPageServlet">Главная страница</a>
        <a href="BookInfoServlet">About</a>
        <a href="#contact/">Contact</a>
        <a href="LoginServlet">Вход</a>
        <a href="RegisterServlet">Регистрация</a>
    </div>

<%--    <form action="RegisterServlet" method="POST" >--%>
<%--    <div id="right">--%>
<%--        <input type="submit" value="Зарегистрироваться"/>--%>
<%--&lt;%&ndash;        <a href="RegisterServlet">Регистрация</a>&ndash;%&gt;--%>
<%--        &lt;%&ndash; чтобы ссылка работала, необходимо в ахрев добавить ссылку на соотв сервлет--%>
<%--        лучше делать форму с ссылкой на сервлет, чтобы это была кнопка, а не просто ссылка&ndash;%&gt;--%>
<%--    </div>--%>
<%--    </form>--%>
<%--    <br>--%>
<%--    <form action="LoginServlet" method="POST">--%>
<%--    <div id="right">--%>
<%--        <input type="submit" value="Вход"/>--%>
<%--    </div>--%>
<%--    </form>--%>
</head>
<body id="test">

<div class="my_boks" >
    <div class="my_boks1" >
        <img src="https://almabooks.com/wp-content/uploads/2016/10/9781847493736.jpg" >
        <a class="my_boks01" href="#">1 Блок</a>
        1 Блок</div>
    <div class="my_boks2" >
        <img src="https://almabooks.com/wp-content/uploads/2016/10/9781847493736.jpg" >
        <a class="my_boks01" href="#">1 Блок</a>
        2 Блок</div>
    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        3 Блок</div>
    <div class="my_boks1">
        <a class="my_boks01" href="#">1 Блок</a>
        4 Блок</div>
    <div class="my_boks2">
        <a class="my_boks01" href="#">1 Блок</a>
        5 Блок</div>
    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>
    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>

    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>

    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>
    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>

    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>

    <div class="my_boks3">
        <a class="my_boks01" href="#">1 Блок</a>
        6 Блок</div>





</div>


<%--<form>--%>
<%--    <p><select name="food">--%>
<%--            <option value="1"  class="icon-ok">+375257371482</option>--%>
<%--            <option value="0" class="icon-error">+375299895468</option>--%>
<%--    </select></p>--%>
<%--</form>--%>
<table border="1">
    <caption>Список авторов</caption>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
    </tr>

    <c:forEach items="${group}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>  ${author.lastName}</td>
<%--            <td>${author.authorID}</td>--%>

        </tr>
    </c:forEach>

    </td>
    </td>

</table>



<%--    <table border="1">- для комментариев на главной странице-%>
<%--        <caption>Comments</caption>--%>
<%--        <tr>--%>
<%--            <th>Comment</th>--%>
<%--        </tr>--%>

<%--        <c:forEach items="${commentText}" var="review">--%>
<%--            <tr>--%>
<%--                <td>${review.commentText}</td>--%>

<%--            </tr>--%>
<%--        </c:forEach>--%>

<%--        </td>--%>
<%--        </td>--%>

<%--    </table>--%>


<%--</form>--%>

<form method="POST" action="MainPageServlet"> Новый :
    <p> Введите имя <input name="firstName" type="text" /> </p>
    <input name="search" type="submit" />
<%--    <p> Введите иd <input name="id" type="text" /> </p>--%>
<%--    <input name="search" type="submit" />--%>
</form>

<%--<form action="" method="get">--%>
<%--    <input name="s" placeholder="Искать здесь..." type="search">--%>
<%--    <button type="submit" a href="SearchServlet">Поиск</button>--%>
<%--    <a href="SearchServlet">Поиск</a>--%>
<%--</form>--%>
<div id="header">
    <a href="#">1</a>
    <a href="#">2</a>
    <a href="#">3</a>
</div>








<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>
