package by.iba.servlet;

import by.iba.dao.AuthorDao;
import by.iba.dao.BooksDao;
import by.iba.dao.ReviewDao;
import by.iba.model.Author;
import by.iba.model.Books;
import by.iba.model.Review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainPageServlet", value = "/MainPageServlet")
public class MainPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AuthorDao daoAuthor = new AuthorDao();
        BooksDao daoBooks = new BooksDao();
        ReviewDao daoReview = new ReviewDao();
//        request.setAttribute("group", daoAuthor.searchAuthor(new Author()));//просто их показывает
//        request.setAttribute("group", daoAuthor.getAuthors());//просто показывает
//        request.getRequestDispatcher("/WEB-INF/views/mainPage.jsp")
//                .forward(request, response);
//        request.setAttribute("group", daoBooks.getBooks());
//        request.setAttribute("commentText", daoReview.getReviews());//просто показывает книги
        request.getRequestDispatcher("/WEB-INF/views/mainPage.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        AuthorDao daoAuthor = new AuthorDao();
        BooksDao daoBooks = new BooksDao();
        String title = request.getParameter("title");
        request.setAttribute("title", title);
//
        String genre = request.getParameter("genre");
        request.setAttribute("genre", genre);
//
//        ReviewDao daoReview = new ReviewDao();
//        String commentText = request.getParameter("commentText");

        String firstName = request.getParameter("firstName"); //name
        request.setAttribute("firstName", firstName);
//        String lastName = request.getParameter("lastName");
//        request.setAttribute("lastName", lastName);
//        int authorID = Integer.parseInt(request.getParameter("authorID")); //id в mainPage.jsp
//        request.setAttribute("authorID", authorID);


//        if (firstName.isEmpty() || lastName.isEmpty()) { //не работает нормально
//            request.setAttribute("errorMessage", "Заполните все поля");
//        } else {
//            daoAuthor.insertAuthor(new Author(firstName));
//            daoAuthor.deleteAuthor(new Author(id));
//        daoAuthor.searchAthor1(new Author());//можно в принципе удалить, он ничего не выполняет
//        daoAuthor.searchAuthors(firstName, lastName);

        daoBooks.searchBooks(title);

//        }


//        request.setAttribute("group", daoAuthor.getAuthors());
//        request.setAttribute("group", daoAuthor.searchAuthors(firstName, lastName)); //поиск автора
//        request.setAttribute("group", daoAuthor.getAuthors());//тупо всех показывает

        request.setAttribute("group", daoBooks.searchBooks(title));

        request.getRequestDispatcher("/WEB-INF/views/allbooks.jsp").forward(request, response);

    }
}
