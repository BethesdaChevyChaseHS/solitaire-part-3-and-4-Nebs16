package solitaire;

public class App {
    public static void main(String[] args) { 
      GameState gameState = new GameState();
      new SolitaireGUI(gameState);

      System.out.println("ord of ace is " + Rank.ACE.ordinal());
      System.out.println("ord of two is " + Rank.TWO.ordinal());
      System.out.println("ord of king is " + Rank.KING.ordinal());

    }
}