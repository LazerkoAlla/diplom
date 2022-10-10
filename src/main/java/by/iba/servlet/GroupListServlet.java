package by.iba.servlet;

import by.iba.dao.AuthorDao;
import by.iba.model.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GroupListServlet", value = "/GroupListServlet")
public class GroupListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AuthorDao daoAuthor = new AuthorDao();

        String firstName = request.getParameter("firstName"); //name
//        String lastName = request.getParameter("lastName");
        int id = Integer.parseInt(request.getParameter("authorID")); //name е надо если просто добавлять имя и фамили
        //ид автоинкремент, поэтому он по сути и не нужен
//        int authorID = request.getParameter("authorID");
//        int authorID = Integer.parseInt(request.getParameter("authorID"));

//        if (firstName.isEmpty() || lastName.isEmpty()) {
//            request.setAttribute("errorMessage", "Заполните все поля");
////        } else {
//            daoAuthor.insertAuthor(new Author(firstName, lastName));
//            daoAuthor.deleteAuthor(new Author(id));
        daoAuthor.updateAuthor(new Author(firstName, id)); //почему-то теперь вставляет нулы
//        }
        request.setAttribute("group", daoAuthor.getAuthors());
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AuthorDao daoAuthor = new AuthorDao();
        request.setAttribute("group", daoAuthor.getAuthors());
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
                .forward(request, response);
    }
}


