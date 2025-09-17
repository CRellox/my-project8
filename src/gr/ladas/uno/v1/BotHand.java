package gr.ladas.uno.v1;

import gr.ladas.uno.v1.model.NumberedCard;
import gr.ladas.uno.v1.model.SpecialCard;
import gr.ladas.uno.v1.model.WildCard;

import java.util.ArrayList;

public class BotHand {

    private ArrayList<NumberedCard> myNumberedCards;
    private ArrayList<WildCard>  myWildCards;
    private ArrayList<SpecialCard>  mySpecialCards;



    public BotHand() {
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
    public void removePlayedBotsCard(Object playedCard) {
        if (playedCard instanceof WildCard) {
            myWildCards.remove(playedCard);
        } else if (playedCard instanceof SpecialCard) {
            mySpecialCards.remove(playedCard);
        } else if (playedCard instanceof NumberedCard) {
            myNumberedCards.remove(playedCard);
        }
    }
}
