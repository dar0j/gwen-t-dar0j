package cl.uchile.dcc
package gwent.cards.classes.weathers

import gwent.cards.classes.AbstractWeather
import gwent.cards.classes.units.CloseCombat
import gwent.field.zones.Zone

class BitingFrost(uccz: Zone[CloseCombat], pcccz: Zone[CloseCombat])
  extends AbstractWeather("Biting Frost") {

  /** Sets the force of all Close Combat Units
   * on both players' side of the field to 1. */
  def bitingFrost(): Unit = {
  }
}
