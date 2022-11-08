package by.iba.servlet;

import by.iba.dao.BooksDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetectiveBookServlet", value = "/DetectiveBookServlet")
public class DetectiveBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.searchDetectives());
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        String genre = request.getParameter("group");
        request.setAttribute("group", genre);

        daoBooks.searchDetectives();

        request.setAttribute("group", daoBooks.searchDetectives());
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);


    }
}
