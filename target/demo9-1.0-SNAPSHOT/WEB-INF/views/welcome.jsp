<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <title> Title</title>

  <!-- Bootstrap core CSS -->
  <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
        rel="stylesheet">

  <style>
    body {
      /*background-image: url(images/bg.jpg);  Путь к фоновому изображению */
      background-color: #c7b39b; /* Цвет фона */
    }
    .footer {
      position: absolute; bottom: 0;
      width: 100%;
      height: 60px;
      background-color: #f5f5f5;
    }

    .footer .container {
      width: auto;
      max-width: 680px;
      padding: 0 15px;
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
  </style>

</head>
<body id="test">

<nav role="navigation" class="navbar navbar-default">

  <div class="">
    <img src = "https://www.kv.by/sites/default/files/user7743/logo_iba_group.jpg" width="50" height="50">
  </div>

  <div class="navbar-collapse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="MainPageServlet">Home</a></li>
    </ul>

    <!-- <ul class="nav navbar-nav navbar-right">
        <li><a href="LoginServlet">Login</a></li>
    </ul> unnecessary login-->

    <ul class="nav navbar-nav navbar-right">
      <li><a href="LogoutServlet">Logout</a></li>
    </ul>
  </div>

</nav>
<div class="container">
  <H2>Welcome ${name}</H2>

  <table border="1">
    <caption>Список вашей группы</caption>
    <tr>
      <th>Имя</th>
      <th>Телефон</th>
      <th>email</th>
    </tr>

    <c:forEach items="${group}" var="author">
      <tr>
<%--        <td>${author.authorID}</td>--%>
        <td>${author.firstName}</td>
        <td>  ${author.lastName}</td>
<%--        <td>${author.authorID}</td>--%>

      </tr>
    </c:forEach>

    </td>
    </td>

  </table>

  <p><font color="red">${errorMessage}</font></p>
  <form method="POST" action="GroupListServlet"> Новый :
    <p> Введите иd <input name="authorID" type="text" /> </p>
    <p> Введите имя <input name="firstName" type="text" /> </p>
    <p> Введите фамилию <input name="lastName" type="text" /> </p>
    <input name="add" type="submit" />
  </form>
</div>
<br>
<div>
  <form method="POST" action="GroupListServlet"> удалить :
    <p> Введите иd <input name="authorID" type="text" /> </p>
    <input name="delete" type="submit" />
  </form>
</div>

<div>
  <form method="POST" action="GroupListServlet"> change :
    <p> измените имя <input name="firstName" type="text" /> </p>
    <p> измените иd <input name="authorID" type="text" /> </p>
    <input name="update" type="submit" />
  </form>
</div>
<div id="footer">
  Все права защищены &copy;
</div>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>


