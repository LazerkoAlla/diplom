package by.iba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class User {

    private int id;
    private String login;
    private String password;

    public User(String name, String password) {
        this.login = name;
        this.password = password;
    }
}