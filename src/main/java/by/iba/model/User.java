package by.iba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class User {

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    private int id;
    private String login;
    private String password;
    private int role;
    private int customerID;

    public User (int id, String login, String password, int role, int customerID) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.customerID = customerID;
    }




    public User(String name, String password) {
        this.login = name;
        this.password = password;
    }


    public User() {

    }
}