package cl.uchile.dcc
package gwent.field.zones

import cl.uchile.dcc.gwent.cards.ICard
import scala.collection.mutable.ArrayBuffer

/** Abstract class that implements the IZone interface giving a max capacity of 10 spots.*/
abstract class AbstractZone extends IZone {
  val Z: ArrayBuffer[ICard] = new ArrayBuffer[ICard](10)
}
