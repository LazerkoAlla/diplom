package by.iba.dao;
import by.iba.model.Author;
import by.iba.util.ConnectorDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AuthorDao {

    private static final Logger logger = LogManager.getLogger(AuthorDao.class);

    private final static String SQL_GET_AUTHORS = "SELECT * FROM authors";
    private final static String SQL_INSERT_AUTHORS = "INSERT INTO authors(firstName, lastName) VALUES (?,?)";
    private final static String SQL_DELETE_AUTHORS = "delete from authors where authorID = ? ";
    private final static String SQL_UPDATE_AUTHORS = "UPDATE authors SET firstName=? where authorID = ?";
    private final static String SQL_SEARCH_AUTHORS = "select * from authors where authorID=?";

    private static Connection connection;

    PreparedStatement ps = null;
    ResultSet rs = null;

    public AuthorDao() {
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

    public void insertAuthor(Author author) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_INSERT_AUTHORS);
            preparedStatement.setString(1, author.getFirstName());
            preparedStatement.setString(2, author.getLastName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info("New Author " + author.getFirstName() + " inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void deleteAuthor(Author author) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DELETE_AUTHORS);
            preparedStatement.setInt(1, author.getAuthorId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" Author " + author.getAuthorId() + " deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAuthor(Author author) {

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_UPDATE_AUTHORS);
            preparedStatement.setString(1, author.getFirstName());
            preparedStatement.setInt(2, author.getAuthorId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            logger.info(" Author " + author.getAuthorId() + " updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Author searchAthor1(Author author) {

//        con = ConnectorDB.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(SQL_UPDATE_AUTHORS);
            ps.setInt(1,author.getAuthorId());
            rs = ps.executeQuery();
            while (rs.next()) {
                author.setAuthorId(rs.getInt("authorID"));
                author.setFirstName(rs.getString("firstName"));
                author.setLastName(rs.getString("lastName"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return author;
    }

    public List<Author> searchAuthor(Author author) {
        List<Author> authors = new ArrayList<Author>();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_SEARCH_AUTHORS);

            preparedStatement.setString(1, author.getFirstName());
//            ResultSet rs;

        rs=preparedStatement.executeQuery();
            preparedStatement.close();
            logger.info(" Author " + author.getFirstName()  +" found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    }








    public List<Author> getAuthors() {
        List<Author> authors = new LinkedList<Author>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_AUTHORS);

            Author author = null;
            while (resultSet.next()) {
                author = new Author();

                author.setFirstName(resultSet.getString("firstName"));
                author.setLastName(resultSet.getString("lastName"));
                author.setAuthorId(resultSet.getInt("authorID"));

                authors.add(author);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    }

}