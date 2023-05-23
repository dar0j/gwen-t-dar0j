package cl.uchile.dcc
package gwent

import scala.util.Random

/** Abstract class that factors the actions a player can make, this include
 *  playing a card to the field and drawing a card to the hand.
 */
abstract class Player extends IPlayer with Equals{
  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Player]
      (this eq other)
    } else {
      false
    }
  }
  /**
   * Draws a card from the deck to the hand.
   *
   * @param n How many cards the player draws
   * @param D Deck from a player
   *
   * @return Unit, but shuffles the deck
   */
  def draw(D: Deck, n: Int = 3, H: Hand): Unit = {
    D = Random.shuffle(D)
    for (i <- n) {
      H.+(D[0])
      D.tail
    }
  }
  /** Puts a card from the hand to the deck
   *
   *
   * def play(H: Hand, T): Unit = {
   * Hand to tablero
   * }
   */
}
