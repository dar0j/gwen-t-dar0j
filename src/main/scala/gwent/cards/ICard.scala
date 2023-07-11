package cl.uchile.dcc
package gwent.cards

/**Interface to be implemented by the cards giving them a name.*/
trait ICard {
  /** If it is a Unit or Weather Card. */
  val classification: String
  /** Gets the name of the card.*/
  def name: String
}