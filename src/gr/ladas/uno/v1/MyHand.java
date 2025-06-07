package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.util.ArrayList;

public class MyHand {

    private ArrayList<NumberedCard> myNumberedCards;
    private ArrayList<WildCard>  myWildCards;
    private ArrayList<SpecialCard>  mySpecialCards;



    public MyHand() {
        this.myNumberedCards = new ArrayList<>();
        this.mySpecialCards = new ArrayList();
        this.myWildCards = new ArrayList<>();
    }

    public ArrayList<NumberedCard> getMyNumberedCards() {
        return myNumberedCards;
    }

    public ArrayList<WildCard> getMyWildCards() {
        return myWildCards;
    }

    public ArrayList<SpecialCard> getMySpecialCards() {
        return mySpecialCards;
    }

    public void addNumberedCard(NumberedCard aNumberedCard) {
        this.myNumberedCards.add(aNumberedCard);
    }

    public void addWildCard(WildCard aWildCard) {
        this.myWildCards.add(aWildCard);
    }

    public void addSpecialCard(SpecialCard aSpecialCard) {
        this.mySpecialCards.add(aSpecialCard);
    }
}
