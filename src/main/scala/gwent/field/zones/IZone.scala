package cl.uchile.dcc
package gwent.zones

import cl.uchile.dcc.cards.ICard
import scala.collection.mutable.ArrayBuffer

/**Interface to be implemented by the zones where Units are placed and also by the Hand of a Player.*/
trait IZone {
  val Z: ArrayBuffer[ICard]
}
