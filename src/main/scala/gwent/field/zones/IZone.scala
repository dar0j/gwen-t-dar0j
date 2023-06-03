package cl.uchile.dcc
package gwent.field.zones

import cl.uchile.dcc.gwent.cards.ICard
import scala.collection.mutable.ArrayBuffer

/**Interface to be implemented by the zones where Units are placed and also by the Hand of a Player.*/
trait IZone {
  val Z: ArrayBuffer[ICard]
}
