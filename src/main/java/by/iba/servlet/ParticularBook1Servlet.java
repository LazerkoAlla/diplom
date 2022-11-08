package by.iba.servlet;

import by.iba.dao.BooksDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ParticularBook1Servlet", value = "/ParticularBook1Servlet")
public class ParticularBook1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.getParticularBook1());//1
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.getParticularBook1());//1
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);

    }
}
