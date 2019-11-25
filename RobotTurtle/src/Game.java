
package newrobotturtle;
import java.util.*;


/**
 * Class Game
 */
public class Game {

  //
  // Fields
  //

  private int joueurEnCours;
  /**
   * tableau de joueurs
   */
  private ArrayList players;
  /**
   * matrice de char
   */
  private ArrayList board;
  
  //
  // Constructors
  //
  public Game () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of joueurEnCours
   * @param newVar the new value of joueurEnCours
   */
  private void setJoueurEnCours (int newVar) {
    joueurEnCours = newVar;
  }

  /**
   * Get the value of joueurEnCours
   * @return the value of joueurEnCours
   */
  private int getJoueurEnCours () {
    return joueurEnCours;
  }

  /**
   * Set the value of players
   * tableau de joueurs
   * @param newVar the new value of players
   */
  private void setPlayers (ArrayList newVar) {
    players = newVar;
  }

  /**
   * Get the value of players
   * tableau de joueurs
   * @return the value of players
   */
  private ArrayList getPlayers () {
    return players;
  }

  /**
   * Set the value of board
   * matrice de char
   * @param newVar the new value of board
   */
  private void setBoard (ArrayList newVar) {
    board = newVar;
  }

  /**
   * Get the value of board
   * matrice de char
   * @return the value of board
   */
  private ArrayList getBoard () {
    return board;
  }

  //
  // Other methods
  //

  /**
   */
  public void startGame()
  {
  }


  /**
   */
  private void initGame()
  {
  }


  /**
   */
  private void distrubuteTurn()
  {
  }


  /**
   * @return       boolean
   */
  private boolean testVictory()
  {
      return false;
  }


}
