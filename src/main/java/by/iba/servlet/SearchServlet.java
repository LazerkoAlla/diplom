//package by.iba.servlet;
//
//import by.iba.dao.AuthorDao;
//import by.iba.dao.UserDao;
//import lombok.SneakyThrows;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebServlet(name = "SearchServlet", value = "/SearchServlet")
//public class SearchServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        request
//                .getRequestDispatcher("/WEB-INF/views/mainPage.jsp")
//                .forward(request, response);
//
//    }
//
//    @SneakyThrows
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//
//        AuthorDao authorUser = new AuthorDao();
//        if (authorUser.i(firstName, lastName)) {
//
//            request.getRequestDispatcher("/WEB-INF/views/search.jsp").forward(request, response);
//        } else {
//
//            request.setAttribute("errorRegister", "Выберите другое имя, такой пользователь существет");
//            request.getRequestDispatcher("/WEB-INF/views/search.jsp")
//                    .forward(request, response);
//        }
//
//
////        if (authorUser.isValidAuthor(firstName, lastName)) {
//
//            request.getSession().setAttribute("firstName", firstName);
//
//            Cookie[] cookies = request.getCookies();
//            if (cookies != null) {
//                for (Cookie c : cookies) {
//                    Cookie cookie = c;
//                    System.out.println(cookie.getFirstName() + cookie.getValue());
//                    if (firstName.equals(cookie.getName())) {
//                        request.getSession().setAttribute("lastdate",
//                                cookie.getValue());
//                    }
//                }
//            }
//        }
//    }
//}
