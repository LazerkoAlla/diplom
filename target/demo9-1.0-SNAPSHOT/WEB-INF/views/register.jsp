<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styles.css" />

    <title>the BOOK</title>
</head>
<body id="test">
<form method="POST" action="MainPageServlet">
<div id="div">
    <a href="MainPageServlet">Главная страница</a>
<%--    <a href="#about/">About</a>--%>
    <a href="ContactServlet">Контакты</a>
    <a href="LoginServlet">Вход</a>
    <a href="RegisterServlet">Регистрация</a>
    <input id="input" name="title" type="text" placeholder="Поиск"/>
</div>
</form>
<br>
<div id="login">
        <p><font color="red">${errorRegister}</font></p>

        <form action="RegisterServlet" method="POST">
            <h3 align="center">Создать аккаунт</h3>
            <div align="center">
                <p>Имя пользователя</p>
                <input placeholder="Введите имя" required=""name="newLoginName" type="text" />
                <p>Пароль</p>
                <input placeholder="Введите пароль" id ="password" required="" name="newPassword" type="password" />
                <p> </p>
                <input type="submit" value="Зарегистрироваться"/>
            </div>
        </form>
</div>
<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>