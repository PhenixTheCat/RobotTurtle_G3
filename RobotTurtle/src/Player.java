package newrobotturtle;
import java.util.*;


/**
 * Class Player
 */
public class Player {

  //
  // Fields
  //

  private int nbStoneWall;
  private int nbIceWall;
  /**
   * liste de char
   */
  private ArrayList deck;
  /**
   * liste de char
   */
  private ArrayList hand;
  /**
   * lsite de char
   */
  private ArrayList graveyard;
  /**
   * ArrayDeque de char
   */
  private ArrayList program;
  private Turtle turtle;
  
  //
  // Constructors
  //
  public Player () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nbStoneWall
   * @param newVar the new value of nbStoneWall
   */
  private void setNbStoneWall (int newVar) {
    nbStoneWall = newVar;
  }

  /**
   * Get the value of nbStoneWall
   * @return the value of nbStoneWall
   */
  private int getNbStoneWall () {
    return nbStoneWall;
  }

  /**
   * Set the value of nbIceWall
   * @param newVar the new value of nbIceWall
   */
  private void setNbIceWall (int newVar) {
    nbIceWall = newVar;
  }

  /**
   * Get the value of nbIceWall
   * @return the value of nbIceWall
   */
  private int getNbIceWall () {
    return nbIceWall;
  }

  /**
   * Set the value of deck
   * liste de char
   * @param newVar the new value of deck
   */
  private void setDeck (ArrayList newVar) {
    deck = newVar;
  }

  /**
   * Get the value of deck
   * liste de char
   * @return the value of deck
   */
  private ArrayList getDeck () {
    return deck;
  }

  /**
   * Set the value of hand
   * liste de char
   * @param newVar the new value of hand
   */
  private void setHand (ArrayList newVar) {
    hand = newVar;
  }

  /**
   * Get the value of hand
   * liste de char
   * @return the value of hand
   */
  private ArrayList getHand () {
    return hand;
  }

  /**
   * Set the value of graveYard
   * lsite de char
   * @param newVar the new value of graveYard
   */
  private void setGraveyard (ArrayList newVar) {
    graveyard = newVar;
  }

  /**
   * Get the value of graveYard
   * lsite de char
   * @return the value of graveYard
   */
  private ArrayList getGraveYard () {
    return graveyard;
  }

  /**
   * Set the value of program
   * ArrayDeque de char
   * @param newVar the new value of program
   */
  private void setProgram (ArrayList newVar) {
    program = newVar;
  }

  /**
   * Get the value of program
   * ArrayDeque de char
   * @return the value of program
   */
  private ArrayList getProgram () {
    return program;
  }

  /**
   * Set the value of turtle
   * @param newVar the new value of turtle
   */
  private void setTurtle (Turtle newVar) {
    turtle = newVar;
  }

  /**
   * Get the value of turtle
   * @return the value of turtle
   */
  private Turtle getTurtle () {
    return turtle;
  }

  //
  // Other methods
  //

  /**
   */
  public void turn()
  {
  }


  /**
   * retourne les positions X Y en array
   * @return       array
   */
  public ArrayList chooseTile()
  {
      return null;
  }


  /**
   * pour le bug
   */
  public void chooseTarget()
  {
  }


  /**
   */
  public void drawCard()
  {
  }


  /**
   */
  private void choiceTurn()
  {
  }


  /**
   */
  private void placeWall()
  {
  }


  /**
   */
  private void addCard()
  {
  }


  /**
   */
  private void executeProgram()
  {
  }


  /**
   * @param        card
   */
  private void discard(Card card)
  {
  }


  /**
   */
  private void chooseWall()
  {
  }


  /**
   */
  private void chooseCard()
  {
  }


  /**
   * @param        card
   */
  private void addToProgram(Card card)
  {
  }


  /**
   */
  private void shuffle()
  {
  }


  /**
   */
  private void fullHand()
  {
  }


}
