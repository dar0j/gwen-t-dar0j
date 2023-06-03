package cl.uchile.dcc
package gwent.players

import cl.uchile.dcc.gwent.field.zones.classes.{CloseCombatZone, RangeZone, SiegeZone}

/** Abstract class that factors the actions a player can make, this include
 *  playing a card to the field and drawing a card to the hand.
 */
abstract class AbstractPlayer
  extends IPlayer {
  protected var gems: Int = 2
  val ccz = new CloseCombatZone
  val rz = new RangeZone
  val sz = new SiegeZone

  /**
   * Plays a card placing it from the hand to the field.
   *
   * @param i Index of the card to be played from the hand.
   * @param H Hand from a player.
   * @return Unit, but the field is updaated.
   */
  def play(i: Int): Unit = {
    val cl = hand(i).classification
    if (cl = "Weather") {
      Field.update(this, "weatherZone")
    } else if (cl = "Siege") {
      Field.update(this, "SiegeZone"")
    } else if (cl = "Range") {
      Field.update(this, "RangeZone")
    } else if (cl = "CloseCombat") {
      Field.update(this, "CloseCombatZone")
    }
  }

    /**
     * Draws a card from the deck to the hand.
     *
     * @param n How many cards the player draws
     * @param D Deck from a player
     * @return Unit, but shuffles the deck
     */
    def draw(n: Int = 3): Unit = {
      deck.shuffle()
      for (i <- 1 to n) {
        hand += deck.head
        deck -= deck.head
      }
    }
  }
}
