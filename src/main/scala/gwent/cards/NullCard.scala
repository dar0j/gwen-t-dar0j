package cl.uchile.dcc
package gwent.cards

import gwent.field.Field

object NullCard
  extends ICard {

  val classification: String = ???
  def name: String = ???
  def toField(field: Field): Unit = {  }
}
