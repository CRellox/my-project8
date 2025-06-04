package UNO;

import java.util.Objects;

public class WildCards {
    private String name;

    public WildCards() {

    }

    public WildCards(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WildCards wildCards = (WildCards) o;
        return Objects.equals(name, wildCards.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "WildCards{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
