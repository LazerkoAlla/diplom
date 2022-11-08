<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" type="text/html" href="css/styles.css" />
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
            padding:10px;
        }
        .my_boks1, .my_boks2, .my_boks3 {
            margin: 10px;
            padding: 50px 60px;
            width: calc(30% - 40px);
            height: 95px;
            display: inline-block;
            opacity: 0.8;
            background-color: whitesmoke;
            border: 3px;
        }
        #links{
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
             /* Кнопка выпадающего списка */
         .dropbtn {
             background-color: whitesmoke;
             font-size: 15px;
             font-weight: bold;
             color: #567ec4;
             opacity: 0.8;
             padding: 20px;
             border: none;
             text-decoration: none;
         }

        /* Контейнер <div> - необходим для размещения выпадающего содержимого */
        .dropdown {
            position: relative;
            display: inline-block;
        }

        /* Выпадающее содержимое (скрыто по умолчанию) */
        .dropdown-content {
            display: none;
            position: absolute;
            background-color: whitesmoke;
            opacity: 0.8;
            min-width: 200px;
            /*box-shadow: 0px 10px 16px 0px rgba(0,0,0,0.2);*/
            z-index: 1;
        }

        /* Ссылки внутри выпадающего списка */
        .dropdown-content a {
            padding: 25px;
            text-decoration: none;
            /*display: block;*/
            color: #567ec4;
        }

         /*Изменение цвета выпадающих ссылок при наведении курсора */
        .dropdown-content a:hover {color: #cc3333; border-bottom-style: solid; border-bottom-color: #cc3333;}

        /* Показать выпадающее меню при наведении курсора */
        .dropdown:hover .dropdown-content {
            display: block;
            padding: 20px 20px;
        }

        /* Изменение цвета фона кнопки раскрывающегося списка при отображении содержимого раскрывающегося списка */
        .dropdown:hover .dropbtn {color: #cc3333; border-bottom-style: solid; border-bottom-color: #cc3333;}
    </style>

    <title>the BOOK</title>
    <h1>the BOOK</h1>
<br>
    <form method="POST" action="MainPageServlet">
    <div id="div">
        <a href="MainPageServlet">Главная страница</a>
<%--        <a href="BookInfoServlet">About</a>--%>
        <a href="ContactServlet">Контакты</a>
        <a href="LoginServlet">Вход</a>
        <a href="RegisterServlet">Регистрация</a>
        <a href="AdminPanelServlet">Админ панель</a>
<%--        поменяла--%>
        <input id="input" name="title" type="text" placeholder="Поиск"/>
<%--        <%@include file="adminPage.jsp"%>--%>
    </div>
    </form>
</head>
<body id="test">



<div class="dropdown">
    <button class="dropbtn">Каталог</button>
    <div class="dropdown-content">
        <a href="ChildrenBookServlet">Детская литература</a>
        <a href="DetectiveBookServlet">Детективы</a>
        <a href="NovelBookServlet">Романы</a>
        <a href="EducationBookServlet">Образование</a>
    </div>
</div>





<div class="my_boks" >
    <div class="my_boks1" >
<%--        <img src="https://almabooks.com/wp-content/uploads/2016/10/9781847493736.jpg" >--%>
        <a href="ParticularBook3Servlet">Джейн Эйр</a>
        1 Блок</div>
    <div class="my_boks2" >
<%--        <img src="https://almabooks.com/wp-content/uploads/2016/10/9781847493736.jpg" >--%>
        <a href="ParticularBook4Servlet">Гордость и предубеждение</a>
        2 Блок</div>
    <div class="my_boks3">
        <a href="ParticularBook1Servlet">Повесть о Гэндзи</a>
        3 Блок</div>
    <div class="my_boks1">
        <a href="ParticularBook5Servlet">Эпоха невинности</a>
        4 Блок</div>

</div>

<div id="links">
    <a href="#">1</a>
    <a href="#">2</a>
    <a href="#">3</a>
</div>

<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>
