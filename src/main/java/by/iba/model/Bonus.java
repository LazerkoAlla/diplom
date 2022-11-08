package by.iba.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bonus {

    private int bonusID;
    private int bookID;
    private float bonus;

    public int getBonusID() {
        return bonusID;
    }

    public int getBookID() {
        return bookID;
    }

    public float getBonus() {
        return bonus;
    }


    public void setBonusID(int bonusID) {
        this.bonusID = bonusID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }



}
