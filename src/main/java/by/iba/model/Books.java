package by.iba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Books extends Review {

    private int bookID;
    private int authorID;
    private int publisherID;
    private String title;
    private String isbn;
    private String genre;
    private float price;
    private float rating;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public int getBookID() {
        return bookID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public float getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }


    public Books(String title) {

        this.title = title;
    }

    public Books(float rating, int bookID) {

        this.rating = rating;
    }

    public Books(String title, String isbn, String genre, float price, String description) {

        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        this.price = price;
        this.description = description;
    }
    public Books(int bookID) {

        this.bookID = bookID;
    }
    public Books(int bookID, String title, String isbn, String genre, float price, String description) {

        this.bookID=bookID;
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        this.price = price;
        this.description = description;
    }
}
