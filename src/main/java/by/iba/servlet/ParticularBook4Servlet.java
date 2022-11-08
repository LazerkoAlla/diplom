package by.iba.servlet;

import by.iba.dao.BooksDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ParticularBook4Servlet", value = "/ParticularBook4Servlet")
public class ParticularBook4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.getParticularBook4());//4
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.getParticularBook4());//4
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);
//когда на главной странице я жму на ссылку с конкретной книгой, меня перенаправляет на страницу
        //где просто лежит вся инфа о книге (которая еще и задействована в сервлете с поиском)
        //другие сервлеты с конкретной книгой перекидывают на чистую страницу сеарч
    }

}
