package UNO;

import java.util.Objects;

public class Cards {
    private String color;
    private String number;

    public Cards() {

    }

    public Cards(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(color, cards.color) && Objects.equals(number, cards.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, number);
    }
}
