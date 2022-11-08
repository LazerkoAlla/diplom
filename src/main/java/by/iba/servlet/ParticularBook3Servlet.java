package by.iba.servlet;

import by.iba.dao.BooksDao;
import by.iba.dao.ReviewDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ParticularBook3Servlet", value = "/ParticularBook3Servlet")
public class ParticularBook3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BooksDao daoBooks = new BooksDao();
        request.setAttribute("group", daoBooks.getParticularBook3());//3
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();
//        int id = Integer.parseInt(request.getParameter("bookID"));

        request.setAttribute("group", daoBooks.getParticularBook3());//3
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);

    }
}
