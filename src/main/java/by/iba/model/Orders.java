package by.iba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
public class Orders {

        public Orders (int orderID, int bookID, int customerID, int orderDate, int quantity, int total) {
        this.orderID = orderID;
        this.bookID = bookID;
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.total = total;
    }

    private int orderID;
    private int bookID;
    private int customerID;
    private int orderDate; //тип datе в бд
    private int quantity;
    private int total;

//    public Orders (int orderID, int bookID, int customerID, int orderDate, int quantity, int total) {
//        this.orderID = orderID;
//        this.bookID = bookID;
//        this.customerID = customerID;
//        this.orderDate = orderDate;
//        this.quantity = quantity;
//        this.total = total;
//    }

//    public Orders() {
//
//    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
