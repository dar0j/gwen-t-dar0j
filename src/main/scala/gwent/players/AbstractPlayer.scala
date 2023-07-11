package cl.uchile.dcc
package gwent.players

import gwent.cards.classes.units.{CloseCombat, Siege}
import gwent.field.Deck
import gwent.field.zones.{Hand, Zone}

import scala.collection.mutable.ListBuffer
import scala.util.Random.shuffle

/** Abstract class that factors the actions a player can make, this include
 *  playing a card to the field and drawing a card to the hand.
 */
abstract class AbstractPlayer
  extends IPlayer {
  protected var gems: Int = 2
  val ccz = new Zone[CloseCombat]
  val rz = new Zone[Range]
  val sz = new Zone[Siege]
//  val deck: Deck = _

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
   * @return Unit, but shuffles the deck
   */
  def draw(n: Int = 3): Unit = {
    for (i <- 1 to n) {
      hand += deck.head
      deck -= deck.head
    }
    shuffleDeck()
  }

  def shuffleDeck(): Unit = {
    deck = shuffle(deck)
  }

  val hand: Hand = draw(10)

  val observers: ListBuffer[Observer[T]] = ListBuffer()

  def registerObserver(o: Observer[T]): Unit = observers += o

  def notifyObservers(response: T) = {
    for (o <- observers) {
      o.update(this, response)
    }
  }
}
