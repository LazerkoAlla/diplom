
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books info</title>
        <link rel="stylesheet" type="text/css" href="css/styles.css" />

<%--    <h1>the BOOK</h1>--%>

</head>
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
<br>
<div id="ri">
<%--<table width="200" bgcolor="#c0c0c0" cellspacing="0" cellpadding="5" border="1" align="right">--%>
<%--    <caption>Список книг</caption>--%>
<%--&lt;%&ndash;    в принципе он все показывает и без таблицы &ndash;%&gt;--%>
<%--    <tr>--%>
<%--        <th>название</th>--%>
<%--        <th>избн</th>--%>
<%--        <th>жанр</th>--%>
<%--        <th>цена</th>--%>
<%--        <th>оценка</th>--%>
<%--        <th>описание</th>--%>
<%--    </tr>--%>

<%--    <c:forEach items="${group}" var="books">--%>
<%--        <tr>--%>
<%--            <td>${books.title}</td>--%>
<%--            <td>  ${books.isbn}</td>--%>
<%--            <td>  ${books.genre}</td>--%>
<%--            <td>  ${books.price}</td>--%>
<%--            <td>  ${books.rating}</td>--%>
<%--            <td>  ${books.description}</td>--%>






<%--        &lt;%&ndash;            <td>${author.authorID}</td>&ndash;%&gt;--%>

<%--        </tr>--%>
<%--    </c:forEach>--%>


<%--</table>--%>

<br>

<c:forEach items="${group}" var="books">
<p>Книга ${books.title}</p>
</c:forEach>

<c:forEach items="${group}" var="books">
    <p> ${books.description} </p>
</c:forEach>


<br>
<c:forEach items="${group}" var="books">
    <p> ${books.rating} </p>
</c:forEach>

<p><font color="red">${errorMessage}</font></p>
<form method="POST" action="BookRatingServlet"> Новый :
    <p> change rating <input name="rating" type="text" /> </p>
    <p> Введите иd <input name="bookID" type="text" /> </p>
    <input name="add" type="submit" />


</form>
обновить коммент
    <p><font color="red">${errorMessage}</font></p>
    <form method="POST" action="BookInfoServlet"> Новый :
        <p> Введите текст <input name="commentText" type="text" /> </p>
        <input name="add" type="submit" />
    </form>



<%--   комментарии пока не работают--%>
<%--<table border="1">--%>
<%--    <caption>Список книг</caption>--%>
<%--    &lt;%&ndash;   комментарии пока не работают &ndash;%&gt;--%>
<%--    <tr>--%>
<%--        <th>название</th>--%>
<%--<c:forEach items="${group}" var="books">--%>
<%--    <p> ${books.commentText} </p>--%>
<%--</c:forEach>--%>
<%--    </tr>--%>
<%--</table>--%>

Рецензии
    <br>

    <c:forEach items="${group}" var="books">
        <p> ${books.commentText} </p>
    </c:forEach>






    </table>

    <div id="footer">
    Все права защищены &copy;
</div>
</div>
</body>
</html>
