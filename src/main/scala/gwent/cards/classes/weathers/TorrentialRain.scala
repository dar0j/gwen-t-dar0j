package cl.uchile.dcc
package gwent.cards.classes.weathers

import gwent.cards.classes.AbstractWeather
import gwent.cards.classes.units.Siege
import gwent.field.zones.Zone

import cl.uchile.dcc.gwent.players.IPlayer

class TorrentialRain
  extends AbstractWeather("Torrential Rain") {

  /** Sets the force of all Siege Units
   * on both players' side of the field to 1. */
  def eff(): Unit = {
    for (c in usz) {

    }
    for (c in pcsz) {
      f
    }//update field usz: Zone[Siege], pcsz: Zone[Siege]
  }
}
