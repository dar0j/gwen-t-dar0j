package cl.uchile.dcc
package gwent.field.zones

import gwent.cards.ICard

/** Interface to be implemented by the zones where Units are placed.
 *  Note that the limit of cards in every zone is 10. */
trait IZone[T<:ICard] {

  /** Lists the cards in this zone. */
  protected var cardZone: Vector[T]

  /** Gets the card in the index position provided.
   *
   *  @param index The position of a card in the zone (between 0 and 9). */
  def apply(index: Int): T

  /** Adds the card to the zone.
   *
   *  @param card The card added to the zone. */
  def addCard(card: T): Unit

  /** Removes a card from the zone.
   *
   * @param index The index of the card to be removed from the zone. */
  def removeCard(index: Int): Unit
}
