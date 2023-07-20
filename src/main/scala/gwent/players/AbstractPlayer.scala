package cl.uchile.dcc
package gwent.players

import gwent.cards.ICard
import gwent.cards.classes.units.{CloseCombat, Ranged, Siege}
import gwent.field.Field
import gwent.field.zones.Zone

import scala.collection.mutable.ListBuffer
import scala.util.Random.shuffle

/** Abstract class that factors the actions a player can make, this include
 *  playing a card to the field and drawing a card to the hand.
 *
 *  @param _name The customized name of the player.
 *  @param _deck The given deck of the player.
 *  @param _hand The hand created of the player. */
abstract class AbstractPlayer(private val _name: String,
                              private var _gems: Int = 2,
                              private var _deck: List[ICard],
                              private var _hand: List[ICard])
  extends IPlayer {

  override def gems: Int = _gems

  def loseGem(): Int = _gems -= 1

  override def deck: List[ICard] = _deck

  override def hand: List[ICard] = _hand

  override def name: String = _name

  override protected var closeCombatZone = new Zone[CloseCombat]
  override protected var rangedZone = new Zone[Ranged]
  override protected var siegeZone = new Zone[Siege]

  override def playCard(index: Int, field: Field): Unit = {
    hand(index).toField(this, field)
  }

  def drawCards(howMany: Int = 3): Unit = {
    for (i <- 1 to howMany) {
      _hand = deck.head +: hand
      _deck = deck.tail
    }
  }


  override def shuffleDeck(): Unit = {
    _deck = shuffle(deck)
  }

  val observers: ListBuffer[Observer[T]] = ListBuffer()

  def registerObserver(o: Observer[T]): Unit = observers += o

  def notifyObservers(response: T) = {
    for (o <- observers) {
      o.update(this, response)
    }
  }
}
