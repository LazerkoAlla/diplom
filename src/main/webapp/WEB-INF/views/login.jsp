<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/div.css" />
<%--    <style>--%>
<%--        input::-webkit-input-placeholder {--%>
<%--            color: #B6C0A5;--%>
<%--            font-style: italic;--%>
<%--            background: #E0EFCA;--%>
<%--        }--%>
<%--        input:-moz-placeholder {--%>
<%--            color: #B6C0A5;--%>
<%--            font-style: italic;--%>
<%--            background: #E0EFCA;--%>
<%--        }--%>
<%--        input:-ms-input-placeholder {--%>
<%--            color: #B6C0A5;--%>
<%--            font-style: italic;--%>
<%--            background: #E0EFCA;--%>
<%--        }--%>
<%--        #right {--%>
<%--            float: right;--%>
<%--            padding-right: 20px;--%>
<%--        }--%>

<%--        #test {--%>
<%--            background: url(https://images.pexels.com/photos/3728084/pexels-photo-3728084.jpeg?auto=compress&cs=tinysrgb&w=1600) no-repeat;--%>
<%--            -moz-background-size: 100%; /* Firefox 3.6+ */--%>
<%--            -webkit-background-size: 100%; /* Safari 3.1+ и Chrome 4.0+ */--%>
<%--            -o-background-size: 100%; /* Opera 9.6+ */--%>
<%--            background-size: 100%;--%>
<%--            color: whitesmoke; /* Цвет текста */--%>
<%--            width: 100%;--%>
<%--        }--%>
<%--        /* Links border-bottom: 1px dotted #333333; */--%>

<%--        a { text-decoration: none; font-weight: bold;--%>

<%--            display:flex;--%>
<%--            justify-content:space-around;--%>
<%--            align-items:center;--%>
<%--            flex-wrap:wrap;--%>

<%--            /*Чтобы ничего не слиплось*/--%>
<%--            display:inline-block;--%>
<%--            padding:10px;--%>
<%--            float: right;--%>
<%--        }--%>
<%--        h1 {--%>
<%--            color: #81a2c3;--%>
<%--        }--%>

<%--        a:link { color: #567ec4; border-bottom-color: #567ec4;}--%>

<%--        a:visited { color: #81a2c3; border-bottom-color: #81a2c3; }--%>

<%--        a:hover, a:active { color: #cc3333; border-bottom-style: solid; border-bottom-color: #cc3333; }--%>
<%--        /* Lists */--%>

<%--        ul, ol, dl--%>
<%--        {--%>
<%--            margin: 15px 25px;--%>
<%--            line-height: 2.0em;--%>
<%--        }--%>

<%--        ol { margin-left: 30px; }--%>

<%--        ul { list-style-type: square; }--%>
<%--        /* Navigation */--%>

<%--        #navigation ul { margin: 0; padding: 0; list-style-type: none; float: left; }--%>

<%--        #navigation li { float: left; }--%>

<%--        #navigation a--%>
<%--        {--%>
<%--            float: right;--%>
<%--            display: block;--%>
<%--            color: #567ec4;--%>
<%--            padding: 5px 5px;--%>
<%--            border-bottom-width: 0;--%>
<%--        }--%>

<%--        #navigation a:hover, #navigation a:active--%>
<%--        {--%>
<%--            color: #000000;--%>
<%--        }--%>

<%--        #navigation li.active a--%>
<%--        {--%>
<%--            color: #000000;--%>
<%--        }--%>
<%--        #div {--%>
<%--            width: auto;--%>
<%--            height: 40px;--%>
<%--            position: absolute;--%>
<%--            top: 0;--%>
<%--            right: 0;--%>
<%--            bottom: 0;--%>
<%--            left: 0;--%>
<%--            /*margin-bottom: 100px;*/--%>
<%--            /*margin: 80px;*/--%>
<%--            opacity: 0.8;--%>
<%--            background: ghostwhite; /* Цвет фона */--%>
<%--            padding: 10px; /* Поля вокруг текста */--%>


<%--        }--%>
<%--        #footer {--%>

<%--            position: fixed; /* Фиксированное положение */--%>
<%--            left: 0; bottom: 0; /* Левый нижний угол */--%>
<%--            padding: 10px; /* Поля вокруг текста */--%>
<%--            background: whitesmoke; /* Цвет фона */--%>
<%--            color: #fff; /* Цвет текста */--%>
<%--            width: 100%; /* Ширина слоя */--%>
<%--            height: 40px;--%>
<%--            opacity: 0.8;--%>
<%--            color:#567ec4;--%>
<%--            font-size: 15px;--%>
<%--            /*font-style: italic;*/--%>
<%--            font-weight: bold;--%>
<%--            display:flex;--%>
<%--            justify-content:space-around;--%>
<%--            align-items:center;--%>
<%--            flex-wrap:wrap;--%>
<%--        }--%>

<%--        #header{--%>
<%--            /*position: center; !* Фиксированное положение *!*/--%>
<%--            /*left: 0;*/--%>
<%--            bottom: 110px; /* Левый нижний угол */--%>
<%--            padding: 10px; /* Поля вокруг текста */--%>
<%--            background: whitesmoke; /* Цвет фона */--%>
<%--            color: #fff; /* Цвет текста */--%>
<%--            /*width: 70%; !* Ширина слоя *!*/--%>
<%--            height: 190px;--%>
<%--            opacity: 0.8;--%>
<%--            color:#567ec4;--%>
<%--            font-size: 15px;--%>
<%--            /*font-style: italic;*/--%>
<%--            font-weight: bold;--%>
<%--            display:flex;--%>
<%--            justify-content:center;--%>
<%--            align-items:center;--%>

<%--            /*left:60%;*/--%>
<%--            /*right: 60%;*/--%>
<%--            /*margin: 90px 0;*/--%>
<%--            /*margin:90px 35% 0 35%;*/--%>
<%--            width:40%;--%>
<%--            margin-left:auto;--%>
<%--            margin-right:auto;--%>
<%--            margin-top: 110px;--%>
<%--        }--%>
<%--    </style>--%>
    <title>Title</title>
</head>
<body id="test">
<div id="div">
    <a href="MainPageServlet">Главная страница</a>
    <a href="#about/">About</a>
    <a href="#contact/">Contact</a>
    <a href="LoginServlet">Вход</a>
    <a href="RegisterServlet">Регистрация</a>
</div>
<div id="header"  >
    <section id="content">

        <p><font color="red">${errorMessage}</font></p>
        <form action="LoginServlet" method="POST">
            <h1> Вход в систему</h1>
            <div>
                <input placeholder="Имя" required="" id ="username" name="name" type="text" />
            </div>
            <div>
                <input placeholder="Пароль" required=""id ="password" name="password" type="password" />
            </div>
            <div>
                <input type="submit" value="Войти" />
            </div>
            <div>

                <a href="MainPageServlet">Обратно на главную страницу (исправить на нормальную кнопку!но не как форма,
                    потому что срабатывает не тот сервлет)</a>
        </div>
            <div>

                <a href="RegisterServlet">Регистрация</a>

            </div>
        </form>
    </section>
</div>
<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>
