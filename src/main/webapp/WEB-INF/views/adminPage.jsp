<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css"  content="text/html" href="css/styles.css" />
    <link rel="stylesheet" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <title>the BOOK</title>

</head>
<br>

<body id="test">
<form method="POST" action="MainPageServlet">
    <div id="div">
        <a href="MainPageServlet">Главная страница</a>
        <a href="BookInfoServlet">About</a>
        <a href="ContactServlet">Контакты</a>
        <a href="LoginServlet">Вход</a>
        <a href="RegisterServlet">Регистрация</a>
        <input id="input" name="title" type="text" placeholder="Поиск"/>



    </div>
</form>
<div id="ri">
    <p>in progress</p>
    <a href="html/addbook.html">Добавить книгу</a>
<br>
    <br>
    <br>
<p><font color="red">${errorMessage}</font></p>
<form name="test" method="post" action="AdminPanelServlet">
    <p><b>Название:</b><br>
        <input type="text" size="40" name="title">
    </p>
    <p><b>Isbn:</b><br>
        <input type="text" size="40" name="isbn">
    </p>
    <p><b>Жанр</b><br>
        <input type="text" size="40" name="genre">
    </p>
    <p><b>Цена</b><br>
        <input type="text" size="40" name="price">
    </p>
    <p><b>Описание</b><br>
        <input type="text" size="40" name="description">
    </p>
    <p><input type="submit" value="Добавить">
</form>
<br>
<form name="test" method="post" action="DeleteBookServlet">
    <p><b>Название:</b><br>
        <input type="text" size="40" name="bookID">
    </p>
    <p><input type="submit" value="Удалить">
</form>

<table width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="1" align="right">
    <caption>Список книг</caption>
<%--    в принципе он все показывает и без таблицы --%>
    <tr>
        <th>id</th>
        <th>название</th>
        <th>избн</th>
        <th>жанр</th>
        <th>цена</th>
        <th>оценка</th>
        <th>описание</th>
    </tr>

    <c:forEach items="${group}" var="books">
        <tr>
            <td>${books.bookID}</td>
            <td>${books.title}</td>
            <td>  ${books.isbn}</td>
            <td>  ${books.genre}</td>
            <td>  ${books.price}</td>
            <td>  ${books.rating}</td>
            <td>  ${books.description}</td>

        </tr>
    </c:forEach>


</table>

<form name="test" method="post" action="UpdateBookServlet">
    <p><b>ID:</b><br>
        <input type="text" size="40" name="bookID">
    </p>
    <p><b>Название:</b><br>
        <input type="text" size="40" name="title">
    </p>
    <p><b>Isbn:</b><br>
        <input type="text" size="40" name="isbn">
    </p>
    <p><b>Жанр</b><br>
        <input type="text" size="40" name="genre">
    </p>
    <p><b>Цена</b><br>
        <input type="text" size="40" name="price">
    </p>
    <p><b>Описание</b><br>
        <input type="text" size="40" name="description">
    </p>
    <p><input type="submit" value="Изменить">
</form>

<table width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="1">
    <caption>Список юзеров</caption>
    <%--    в принципе он все показывает и без таблицы --%>
    <tr>
        <th>id</th>
        <th>роль</th>
        <th>ид в системе</th>
        <th>логин</th>
        <th>пароль</th>
    </tr>

    <c:forEach items="${people}" var="people">
        <tr>
            <td>${people.id}</td>
            <td>${people.role}</td>
            <td>${people.customerID}</td>
            <td>${people.login}</td>
<%--            <td>${people.pass}</td>--%>

        </tr>
    </c:forEach>


</table>

<br>
<table width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="1">
    <caption>Список заказов</caption>
    <%--    в принципе он все показывает и без таблицы --%>
    <tr>
        <th>id заказа</th>
        <th>ид книги</th>
        <th>ид покупателя</th>
        <th>дата заказа</th>
        <th>количество</th>
        <th>итог</th>
    </tr>

    <c:forEach items="${orders}" var="orders">
        <tr>
            <td>${orders.orderID}</td>
            <td>${orders.bookID}</td>
            <td>${orders.customerID}</td>
            <td>${orders.orderDate}</td>
            <td>${orders.quantity}</td>
            <td>${orders.total}</td>
                <%--            <td>${people.pass}</td>--%>

        </tr>
    </c:forEach>


</table>
</div>
<div id="footer">
    Все права защищены &copy;
</div>
</body>
</html>
