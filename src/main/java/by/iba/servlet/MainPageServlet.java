package by.iba.servlet;

import by.iba.dao.AuthorDao;
import by.iba.dao.ReviewDao;
import by.iba.model.Author;
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
//        request.setAttribute("group", daoAuthor.searchAuthor(new Author()));//просто их показывает
        request.setAttribute("group", daoAuthor.getAuthors());//просто показывает
        request.getRequestDispatcher("/WEB-INF/views/mainPage.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        AuthorDao daoAuthor = new AuthorDao();

        String firstName = request.getParameter("firstName"); //name
        request.setAttribute("firstName", firstName);
        int authorID = Integer.parseInt(request.getParameter("authorID")); //id в mainPage.jsp
        request.setAttribute("authorID", authorID);


//        if (firstName.isEmpty() || lastName.isEmpty()) { //не работает нормально
//            request.setAttribute("errorMessage", "Заполните все поля");
//        } else {
//            daoAuthor.insertAuthor(new Author(firstName));
//            daoAuthor.deleteAuthor(new Author(id));
        daoAuthor.searchAthor1(new Author());
//        }
//        request.setAttribute("group", daoAuthor.getAuthors());
//        request.setAttribute("group", daoAuthor.searchAuthor(new Author(firstName)));
        request.setAttribute("group", daoAuthor.getAuthors());//тупо всех показывает
        request.getRequestDispatcher("/WEB-INF/views/mainPage.jsp").forward(request, response);

    }
}
