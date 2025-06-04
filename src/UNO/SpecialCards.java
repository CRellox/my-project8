package UNO;

import java.util.Objects;

public class SpecialCards {
    private String color;
    private String effect;

    public SpecialCards() {

    }

    public SpecialCards(String color, String effect) {
        this.color = color;
        this.effect = effect;
    }

    public SpecialCards(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "SpecialCards{" +
                "color='" + color + '\'' +
                ", effect='" + effect + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SpecialCards that = (SpecialCards) o;
        return Objects.equals(color, that.color) && Objects.equals(effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, effect);
    }
}
