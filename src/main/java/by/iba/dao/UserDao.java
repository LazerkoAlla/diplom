package by.iba.dao;

import by.iba.model.Books;
import by.iba.model.User;
import by.iba.util.ConnectorDB;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserDao {

    private final static String SQL_GET_USER = "select login,pass from users where login=? and pass=?";
    private final static String SQL_CHECK_LOGIN = "SELECT login FROM users WHERE login = ?";
    private final static String SQL_INSERT_USER = "INSERT INTO users(login ,pass) VALUES (? , ?)";
    private final static String SQL_CHANGE_PASS = "update users set pass = ? where login= ?";
    private final static String SQL_GET_USER_LIST = "SELECT * FROM USERS";
    private Connection connection;

    public UserDao() {
        try {
            connection = ConnectorDB.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isValidUser(final String login, final String password) {

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_GET_USER);

            ps.setString(1, login);//имя в велком джсп
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    public boolean insertUser(User user) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_CHECK_LOGIN); preparedStatement.setString(1, user.getLogin());
                    ResultSet result = preparedStatement.executeQuery();
            if ( result.next()){ preparedStatement.close(); return false;
            }
            else {
                preparedStatement = connection.prepareStatement(SQL_INSERT_USER);

                preparedStatement.setString(1, user.getLogin());
                preparedStatement.setString(2, user.getPassword());

                preparedStatement.executeUpdate(); preparedStatement.close();

            }
        } catch (SQLException e) { e.printStackTrace();
        }
        return true;
    }

    public boolean changePass(User user) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_CHANGE_PASS);
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getLogin());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public List<User> getUsers() { //все показывает
        List<User> users = new LinkedList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_USER_LIST);

            User users1 = null;
            while (resultSet.next()) {
                users1 = new User();

                users1.setId(resultSet.getInt("id"));
                users1.setRole(resultSet.getInt("role"));
                users1.setCustomerID(resultSet.getInt("customerID"));
                users1.setLogin(resultSet.getString("login"));
//                users1.setPassword(resultSet.getString("pass"));


                users.add(users1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}