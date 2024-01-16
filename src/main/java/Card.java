public class Card {

    private int value;
    private String suit;

    public Card(int value, String suit){
        if (value <1 || value >13) {
            throw new IllegalArgumentException("Value has to be between 1 & 13");
        }
        if (!isValidSuit(suit)){
            throw new IllegalArgumentException("Not a valid suit");
        }
        this.value=value;
        this.suit=suit;
    }
    public boolean isValidSuit(String suit){
        return suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Clubs") || suit.equalsIgnoreCase("Diamonds") || suit.equalsIgnoreCase("Spades");
    }
    public int getValue(){
        return value;
    }
    public String getSuit(){
        return suit;
    }

    public String beats(Card otherCard){
    if(this.value > otherCard.value){
        return "Your card beats the other card";
    } else if (this.value < otherCard.value) {
        return "your card does not beat the other card";
    }
    else {
        if (this.suit.equalsIgnoreCase("Spades") && otherCard.suit.equalsIgnoreCase("Hearts")){
            return "your card beats the other card";
        }
        if (this.suit.equalsIgnoreCase("Diamonds")&& otherCard.suit.equalsIgnoreCase("Clubs")){
            return "your card beats the other card";
        }
        return "your card does not beat the other card";
    }


    }

}


