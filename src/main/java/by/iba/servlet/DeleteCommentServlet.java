package by.iba.servlet;

import by.iba.dao.ReviewDao;
import by.iba.model.Review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteCommentServlet", value = "/DeleteCommentServlet")
public class DeleteCommentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ReviewDao daoReview = new ReviewDao();
        request.setAttribute("commentText", daoReview.getReviews());
        request.getRequestDispatcher("/WEB-INF/views/booksinfo.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ReviewDao daoReview = new ReviewDao();
        int reviewID = Integer.parseInt(request.getParameter("commentText")); //comment

        daoReview.deleteReview(new Review(reviewID));

//        if (commentText.isEmpty()) {
//            request.setAttribute("errorMessage", "Заполните все поля");
//        } else {
//            daoReview.insertReview(new Review(commentText));
//
//        }

        request.setAttribute("commentText", daoReview.getReviews());

//        String commentDelete = request.getParameter("commentDelete"); //comment
//        daoReview.deleteReview(new Review(commentText));

        request.getRequestDispatcher("/WEB-INF/views/booksinfo.jsp").forward(request, response);
//        daoReview.deleteReview(new Review(commentText));


    }
}
