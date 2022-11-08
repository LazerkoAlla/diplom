<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styles.css" />

    <title>Title</title>
</head>
<body id="test">
<form method="POST" action="MainPageServlet">
<div id="div">
    <a href="MainPageServlet">Главная страница</a>
<%--    <a href="#about/">About</a>--%>
    <a href="ContactServlet">Контакты</a>
    <a href="LoginServlet">Вход</a>
    <input id="input" name="title" type="text" placeholder="Поиск"/>
</div>
</form>
<br>
<div id="login">

        <p ><font color="red">${errorMessage}</font></p>
        <form action="LoginServlet" method="POST">
            <h3 align="center">Вход в систему</h3>
            <div align="center">
                <p>Имя пользователя</p>
                <input placeholder="Имя" required="" id ="username" name="name" type="text" />
                <p>Пароль</p>
                <input placeholder="Пароль" required=""id ="password" name="password" type="password" />
                <p> </p>
                <input type="submit" value="Войти" />
            </div>
        </form>

</div>
<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>
