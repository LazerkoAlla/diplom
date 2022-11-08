package by.iba.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private int authorID;
    private String firstName;
    private String lastName;

    public void setAuthorId(int authorID) {
        this.authorID = authorID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public int getAuthorId() {
        return authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Author(int authorID) {
        this.authorID = authorID;
    }
    public Author(String firstName, int authorID) {

        this.firstName = firstName;
        this.authorID = authorID;
    }

    public Author(String firstName) {

        this.firstName = firstName;
    }


}



