package by.iba.dao;

import by.iba.model.Author;
import by.iba.model.Books;
import by.iba.model.Review;
import by.iba.util.ConnectorDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReviewDao {
    private static final Logger logger = LogManager.getLogger(ReviewDao.class);
    private final static String SQL_GET_REVIEW = "SELECT * FROM REVIEW";
    private final static String SQL_GET_REVIEW_FOR_PART_BOOK = " SELECT * FROM review WHERE BookID=?";
    private final static String SQL_INSERT_REVIEW = "INSERT INTO review(commentText) VALUES (?)";
    private final static String SQL_DELETE_Review= "delete from review where reviewID = ? ";
    private final static String SQL_UPDATE_REVIEW = "UPDATE REVIEW SET COMMENTtEXT=? where REVIEWID = ?";

    private static Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ReviewDao() {
        try {
            if (connection == null) {
                connection = ConnectorDB.getConnection();
                logger.info("get connection");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                logger.info("close connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertReview(Review review) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_INSERT_REVIEW);
            preparedStatement.setString(1, review.getCommentText());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info("New comment " + review.getCommentText() + " inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void deleteReview(Review review) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DELETE_Review);
            preparedStatement.setInt(1, review.getReviewID());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" Review " + review.getReviewID() + " deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateReview(Review review) { //работает к конкретной книге

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE review SET commentText = ? WHERE bookID = (SELECT bookid FROM books WHERE bookid=3)");
            preparedStatement.setString(1, review.getCommentText());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info("Review " + review.getReviewID() + " updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Review> getReviews() {
        List<Review> reviews = new LinkedList<Review>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_REVIEW);

            Review review = null;
            while (resultSet.next()) {
                review = new Review();

                review.setCommentText(resultSet.getString("commentText"));
//                author.setId(resultSet.getInt(id));

                reviews.add(review);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviews;
    }

    public List<Review> showComment() { //метод по поиску книг
        List<Review> reviews = new LinkedList<Review>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_REVIEW_FOR_PART_BOOK);

            Review review = null;
            while (resultSet.next()) {
                review = new Review();

                review.setCommentText(resultSet.getString("commentText"));
//                author.setId(resultSet.getInt(id));

                reviews.add(review);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviews;
    }


    public List<Review> getReviewsForBook1(int bookID) { //не работает
        List<Review> reviews = new LinkedList<Review>();
//        con = ConnectorDB.getConnection();
        try {

            String query = SQL_GET_REVIEW_FOR_PART_BOOK;
            ps = connection.prepareStatement(query);
            ps.setInt(1,   bookID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Review review = new Review();
                review.setBookID(rs.getInt("bookID"));
               review.setCommentText(rs.getString("commentText"));


                reviews.add(review);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviews;
    }
}
