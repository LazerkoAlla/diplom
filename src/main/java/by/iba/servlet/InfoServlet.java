package by.iba.servlet;

import by.iba.dao.BooksDao;
import by.iba.dao.ReviewDao;
import by.iba.model.Books;
import by.iba.model.Review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InfoServlet", value = "/InfoServlet")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();
        request.setAttribute("group", daoBooks.getBooks()); //показывает
        request.getRequestDispatcher("/WEB-INF/views/bookrating.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BooksDao daoBooks = new BooksDao();

//        String title = request.getParameter("title");
//        String isbn = request.getParameter("isnb");
//        String genre = request.getParameter("genre");
//        float price = Float.parseFloat(request.getParameter("price"));
//        float rating = Float.parseFloat(request.getParameter("rating"));//name
//        String description = request.getParameter("description");



//        if (title.isEmpty()) {
//            request.setAttribute("errorMessage", "Заполните все поля");
//        } else {
//            daoBooks.insertBook(new Books(title));
//
//        }

        request.setAttribute("group", daoBooks.getBooks());

//        String commentDelete = request.getParameter("commentDelete"); //comment
//        daoReview.deleteReview(new Review());

        request.getRequestDispatcher("/WEB-INF/views/bookrating.jsp").forward(request, response);
//        daoReview.deleteReview(new Review(commentText));

    }
}
