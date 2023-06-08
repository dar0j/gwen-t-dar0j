package cl.uchile.dcc
package gwent.cards

/** Abstract class to be specified by the type of cards who implement this. */
abstract class AbstractCard(_name: String)
  extends ICard {
  /** Sets the name of the card by assigning what is passed as input. */
  override def name: String = _name
}
