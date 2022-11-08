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

public class BooksDao {
    private static final Logger logger = LogManager.getLogger(BooksDao.class);
    private final static String SQL_GET_BOOKS = "SELECT * FROM BOOKS";
    private final static String SQL_INSERT_BOOKS = "INSERT INTO books (title, isbn, genre, price, description) VALUES (?, ?, ?, ?,?)";
    private final static String SQL_DELETE_BOOKS = "delete from books where bookID = ? ";
    private final static String SQL_UPDATE_BOOKS = "UPDATE BOOKS SET title=?, isbn=?, genre=?, price=?, description=?  where bookID = ?";
    private final static String SQL_UPDATE_RATING = "UPDATE books SET RATING=? where bookID = 3";
    private final static String SQL_SEARCH_BOOKS = "select * from books where title like ? ";
    private final static String SQL_SHOW_PARTICULAR_BOOK = "SELECT * FROM BOOKS WHERE bookID=3";

    private static Connection connection;

    PreparedStatement ps = null;
    ResultSet rs = null;

    public BooksDao() {
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

    public void insertBook(Books books) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_INSERT_BOOKS);
            preparedStatement.setString(1, books.getTitle());
            preparedStatement.setString(2, books.getIsbn());
            preparedStatement.setString(3, books.getGenre());
            preparedStatement.setFloat(4, books.getPrice());
            preparedStatement.setString(5, books.getDescription());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info("New Book " + books.getTitle() + " inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(Books books) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DELETE_BOOKS);
            preparedStatement.setInt(1, books.getBookID());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" Book " + books.getBookID() + " deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBook(Books books) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_UPDATE_BOOKS);
            preparedStatement.setString(1, books.getTitle());
            preparedStatement.setString(2, books.getIsbn());
            preparedStatement.setString(3, books.getGenre());
            preparedStatement.setFloat(4, books.getPrice());
            preparedStatement.setString(5, books.getDescription());
            preparedStatement.setInt(6, books.getBookID());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" Book " + books.getTitle() + " updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<? extends Review> searchBooks(String title) { //метод по поиску книг
        List<Books> books = new LinkedList<Books>();

//        con = ConnectorDB.getConnection();
        try {
//            String query = "select * from books where title like ?";
            String query = "SELECT * FROM books INNER JOIN review ON books.bookID = review.bookID WHERE title like ?";
//            String query = SQL_SEARCH_AUTHORS;
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + title+ "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Books book = new Books();
                book.setBookID(rs.getInt("bookID"));
                book.setAuthorID(rs.getInt("authorID"));
                book.setPublisherID(rs.getInt("publisherID"));
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setGenre(rs.getString("genre"));
                book.setPrice(rs.getFloat("price"));
                book.setRating(rs.getFloat("rating"));
                book.setDescription(rs.getString("description"));
                //
//               book.setReviewID(rs.getInt("reviewID"));
//                book.setCustomerID(rs.getInt("customerID"));
//                book.setBookID(rs.getInt("bookID"));
                book.setCommentText(rs.getString("commentText"));
//                book.setReviewerName(rs.getString("reviewerName"));

                books.add(book);

            }
//            resultSet.close();
//            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> getBooks() { //все показывает
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_BOOKS);

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();

                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                author.setId(resultSet.getInt(id));


                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public void updateRating(Books books) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE books SET RATING=? where bookID = 3");
            preparedStatement.setFloat(1, books.getRating());
//            preparedStatement.setInt(2, books.getBookID());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" rating " + books.getRating() + " updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<? extends Review> getParticularBook3() { //ПОКАЗЫВАЕТ КНИГУ ПОД НОМЕРОМ 3
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE BOOKID=3");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> getParticularBook4() { //ПОКАЗЫВАЕТ КНИГУ ПОД НОМЕРОМ 4
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE BOOKID=4");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> getParticularBook1() { //ПОКАЗЫВАЕТ КНИГУ ПОД НОМЕРОМ 1
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE BOOKID=1");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> getParticularBook5() { //ПОКАЗЫВАЕТ КНИГУ ПОД НОМЕРОМ 5
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE BOOKID=5");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> searchNovels() { //novels
            List<Books> books = new LinkedList<Books>();
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE genre ='novel'");

                Books books1 = null;
                while (resultSet.next()) {
                    books1 = new Books();
                    books1.setBookID(resultSet.getInt("bookID"));
                    books1.setTitle(resultSet.getString("title"));
                    books1.setIsbn(resultSet.getString("isbn"));
                    books1.setGenre(resultSet.getString("genre"));
                    books1.setPrice(resultSet.getFloat("price"));
                    books1.setRating(resultSet.getFloat("rating"));
                    books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                    books.add(books1);
                }
                resultSet.close();
                statement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return books;
        }

    public List<Books> searchDetectives() { //detectives
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE genre ='detective'");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> searchEducation() { //education
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE genre ='education'");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Books> searchChildren() { //children book
        List<Books> books = new LinkedList<Books>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books WHERE genre ='children'");

            Books books1 = null;
            while (resultSet.next()) {
                books1 = new Books();
                books1.setBookID(resultSet.getInt("bookID"));
                books1.setTitle(resultSet.getString("title"));
                books1.setIsbn(resultSet.getString("isbn"));
                books1.setGenre(resultSet.getString("genre"));
                books1.setPrice(resultSet.getFloat("price"));
                books1.setRating(resultSet.getFloat("rating"));
                books1.setDescription(resultSet.getString("description"));
//                books1.setCommentText(rs.getString("commentText"));



                books.add(books1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

}
