abstract public class Card {
    private String card_number;
    private String userName;

    // constructor-
    Card(String card_number, String userName) {
        this.card_number = card_number;
        this.userName = userName;
    }

    public String getcard_number() {
        return card_number;
    }   
     public String getuserName() {
        return userName;
    }
   

}