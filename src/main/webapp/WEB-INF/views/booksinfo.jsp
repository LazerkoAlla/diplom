<%--
  Created by IntelliJ IDEA.
  User: lazer
  Date: 01.10.2022
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>the BOOK</title>
    <link rel="stylesheet" type="text/css" href="css/div.css" />

</head>
<body id="test">


<br>

<table border="1">
    <caption>Comments</caption>
    <tr>
        <th>Comment</th>
    </tr>

<%--    <form method="POST" action="DeleteCommentServlet">--%>
    <c:forEach items="${commentText}" var="review">
        <tr>
            <td>${review.commentText}
                <input name="update" type="submit" value="delete" action="DeleteCommentServlet"/>
            </td>

        </tr>
    </c:forEach>

    </td>
    </td>
<%--    </form>--%>

</table>

<p><font color="red">${errorMessage}</font></p>
<form method="POST" action="BookInfoServlet"> Новый :
    <p> Введите текст <input name="commentText" type="text" /> </p>
    <input name="add" type="submit" />
</form>


<div>
    <form method="POST" action="DeleteCommentServlet"> удалить :
        <p> Введите иd <input name="commentText" type="text" /> </p>
        <input name="delete" type="submit" />
    </form>
</div>


<form action="BookInfoServlet" method="post">


<%--    <div class="comments-block">--%>
<%--        <section class="s-line s-product-feedbacks" id="feedbacks">--%>
<%--            <div class="container">--%>
<%--                <div class="w-product-feedbacks">--%>
<%--                    <div class="row">--%>
<%--                        <div class="col-xl-5 col-lg-10 col-md-12">--%>
<%--                            <form class="w-user-feedback-form">--%>
<%--                                <input type="hidden" name="_token" value="tpO57b9JK6hd24TISh4fkApOeL8Cr31OFPLnFPMC" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                <input type="hidden" name="comment_item_id" value="63584" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                <input type="hidden" name="comment_content_type" value="product" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                <div class="section-name _h3 margin-bottom-10">Оставьте ваш отзыв</div>--%>
<%--                                <div class="row row-short-gutters">--%>
<%--                                    <div class="col-md-12 col-12">--%>
<%--                                        <div class="input margin-bottom-10 label-top">--%>
<%--                                            <label>Ваше имя<span class="red">*</span></label>--%>
<%--                                            <input type="text" class="input__default" name="comment_name" value="" placeholder="" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                        </div>--%>
<%--                                        <div class="input margin-bottom-10 label-top" style="display: none;">--%>
<%--                                            <label>Заголовок отзыва<span class="red">*</span></label>--%>
<%--                                            <input type="text" class="input__default" name="comment_title" value="Отзыв" placeholder="" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                        </div>--%>
<%--                                        <div class="input margin-bottom-10 label-top">--%>
<%--                                            <label>Оценка<span class="red">*</span></label>--%>
<%--                                            <input type="hidden" name="comment_stars" value="5" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                            <div class="stars d_stars">--%>
<%--                                                <div class="star active"><i class="fa fa-star" aria-hidden="true"></i></div>--%>
<%--                                                <div class="star active"><i class="fa fa-star" aria-hidden="true"></i></div>--%>
<%--                                                <div class="star active"><i class="fa fa-star" aria-hidden="true"></i></div>--%>
<%--                                                <div class="star active"><i class="fa fa-star" aria-hidden="true"></i></div>--%>
<%--                                                <div class="star active"><i class="fa fa-star" aria-hidden="true"></i></div>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-12 col-12">--%>
<%--                                        <div class="input margin-bottom-10 label-top">--%>
<%--                                            <label>Отзыв<span class="red">*</span></label>--%>
<%--                                            <textarea class="textarea__default" name="comment_note" style="border: 1px solid rgb(202, 202, 202);"></textarea>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-12 col-12">--%>
<%--                                        <div class="input margin-bottom-10 label-top">--%>
<%--                                            <p class="margin-bottom-10">Если у вас вопрос, укажите e-mail для обратной связи.</p>--%>
<%--                                            <label>Ваш e-mail</label>--%>
<%--                                            <input type="text" class="input__default" name="comment_email" value="" placeholder="" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="w-button margin-bottom-10">--%>
<%--                                    <input type="submit" class="button medium blue" id="send-comment" value="Отправить" style="border: 1px solid rgb(202, 202, 202);">--%>
<%--                                </div>--%>
<%--                            </form>--%>
<%--                        </div>--%>
<%--                        <div class="col-xl-7 col-lg-10 col-md-12 w-index-slider">--%>
<%--                            <div class="section-name _h2 margin-bottom-10">Отзывы</div>--%>
<%--                            <div class="row">--%>
<%--                                <div class="col-feedback col-12">--%>
<%--                                    <div class="no-feedbacks-description">--%>
<%--                                        У этого товара ещё нет отзывов.<br>--%>
<%--                                        Будьте первыми, кто оставит отзыв!--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </section>--%>

<%--    </div>--%>

    <table border="1">
        <caption>Comments</caption>
        <tr>
            <th>Comment</th>
        </tr>

        <c:forEach items="${commentText}" var="review">
            <tr>
                <td>${review.commentText}</td>

            </tr>
        </c:forEach>

        </td>
        </td>

    </table>


</form>
</body>
</html>
