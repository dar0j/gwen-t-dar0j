package cl.uchile.dcc
package gwent.cards.classes.weathers

import gwent.cards.classes.AbstractWeather
import gwent.cards.classes.units.{CloseCombat, Range, Siege}
import gwent.field.zones.Zone

class ClearWeather(uccz: Zone[CloseCombat], pcccz: Zone[CloseCombat],
                   urz: Zone[Range], pcrz: Zone[Range],
                   usz: Zone[Siege], pcsz: Zone[Siege])
  extends AbstractWeather("Clear Weather") {

  /** Clears all effects on the field. */
  def clearWeather(): Unit = {
    //set all force to original values
  }

}
