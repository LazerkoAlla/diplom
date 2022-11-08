package by.iba.servlet;

import by.iba.dao.BooksDao;
import by.iba.dao.OrdersDao;
import by.iba.dao.UserDao;
import by.iba.model.Books;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminPanelServlet", value = "/AdminPanelServlet")
public class AdminPanelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDao daoBooks = new BooksDao();
        request.setAttribute("group", daoBooks.getBooks());
        UserDao daoUser = new UserDao();
        request.setAttribute("people", daoUser.getUsers());
        OrdersDao daoOrder = new OrdersDao();
        request.setAttribute("orders", daoOrder.getOrders());
        request.getRequestDispatcher("/WEB-INF/views/adminPage.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        BooksDao daoBooks = new BooksDao();
        String title = request.getParameter("title");
        request.setAttribute("title", title);

        String isbn = request.getParameter("isbn");
        request.setAttribute("isbn", isbn);

        String genre = request.getParameter("genre");
        request.setAttribute("genre", genre);

        float price = Float.parseFloat(request.getParameter("price"));
        request.setAttribute("price", price);

        String description = request.getParameter("description");
        request.setAttribute("description", description);



        if (title.isEmpty() || isbn.isEmpty() || genre.isEmpty() || description.isEmpty()) { //не работает нормально
            request.setAttribute("errorMessage", "Заполните все поля");
        } else {
            daoBooks.insertBook(new Books(title, isbn, genre, price, description));

        }
        OrdersDao daoOrder = new OrdersDao();
        request.setAttribute("orders", daoOrder.getOrders());

        request.setAttribute("group", daoBooks.getBooks());


        request.getRequestDispatcher("/WEB-INF/views/adminPage.jsp")
                .forward(request, response);
    }
}
