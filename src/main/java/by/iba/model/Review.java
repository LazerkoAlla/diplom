package by.iba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Review {

    private int reviewID;
    private int customerID;
    private int bookID;
    private String commentText;
    private String reviewerName;


    public Review(int reviewID) {

        this.reviewID = reviewID;
    }

    public Review (String commentText, int reviewID) {

        this.commentText = commentText;
        this.reviewID = reviewID;
    }
    public Review(String commentText) {

        this.commentText = commentText;
    }


    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewerID) {
        this.reviewID = reviewerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }



}
