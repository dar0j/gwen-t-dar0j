package cl.uchile.dcc
package gwent.cards.classes.weathers

import gwent.cards.classes.AbstractWeather
import gwent.cards.classes.units.Range
import gwent.field.zones.Zone

class ImpenetrableMist(usz: Zone[Range], pcsz: Zone[Range])
  extends AbstractWeather("Impenetrable Mist") {

  /** Sets the force of all Range Units
   * on both players' side of the field to 1. */
  def impenetrableMist(): Unit = {
    //apply
  }
}
