package cl.uchile.dcc
package gwent.cards

abstract class AbstractCard(_name: String)
  extends ICard {
  val classification: String
  override def name: String = _name
}
