package by.iba.servlet;

import by.iba.dao.BooksDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EducationBookServlet", value = "/EducationBookServlet")
public class EducationBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        request.setAttribute("group", daoBooks.searchEducation());
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();

        String genre = request.getParameter("group");
        request.setAttribute("group", genre);

        daoBooks.searchEducation();

        request.setAttribute("group", daoBooks.searchEducation());
        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);


    }
}
