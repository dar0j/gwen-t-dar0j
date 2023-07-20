package cl.uchile.dcc
package gwent.field.zones

import gwent.cards.ICard
import gwent.exceptions.ZoneFullException

class Zone[T<:ICard]()
  extends IZone[T] {

  override protected var cardZone: Vector[T] = Vector.empty[T]//Vector.fill(10)(NullCard)
  override def apply(index: Int): T = {
    cardZone(index)
  }

  override def addCard(card: T): Unit = {
    if (cardZone.length < 10) {
      cardZone = card +: cardZone
    } else {
      throw new ZoneFullException("Cannot add more cards, 10 already.")
    }
  }

  override def removeCard(index: Int): Unit = {
    if (index < cardZone.length && index >= 0) {
      cardZone = cardZone.patch(index, Nil, 1)
    } else {
      throw new IndexOutOfBoundsException("Index out of range for the zone.")
    }
  }
}

