package by.iba.servlet;

import by.iba.dao.BooksDao;
import by.iba.model.Books;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteBookServlet", value = "/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/adminPage.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BooksDao daoBooks = new BooksDao();
        int bookID = Integer.parseInt(request.getParameter("bookID"));
        request.setAttribute("bookID", bookID);




            daoBooks.deleteBook(new Books(bookID));




        request.setAttribute("group", daoBooks.getBooks());

        request.getRequestDispatcher("/WEB-INF/views/adminPage.jsp")
                .forward(request, response);
    }
}
