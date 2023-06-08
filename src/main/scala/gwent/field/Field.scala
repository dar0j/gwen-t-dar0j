package cl.uchile.dcc
package gwent.field

import gwent.cards.classes.AbstractWeather
import gwent.cards.classes.units.{CloseCombat, Range, Siege}
import gwent.field.zones.Zone
import gwent.players.IPlayer

import scala.collection.mutable.ArrayBuffer

class Field(var _weatherZone: ArrayBuffer[AbstractWeather] = new ArrayBuffer[AbstractWeather](1),
            var _userSiegeZone: Zone[Siege] = new Zone[Siege],
            var _userRangeZone: Zone[Range] = new Zone[Range],
            var _userCloseCombatZone: Zone[CloseCombat] = new Zone[CloseCombat],
            var _pcSiegeZone: Zone[Siege] = new Zone[Siege],
            var _pcRangeZone: Zone[Range] = new Zone[Range],
            var _pcCloseCombatZone: Zone[CloseCombat] = new Zone[CloseCombat]) {
  private def weatherZone_(Z: ArrayBuffer[AbstractWeather]) = {
    _weatherZone = Z
  }
  private def userSiegeZone_(z: Zone[Siege]) = {
    _userSiegeZone = z
  }
  private def userRangeZone_(z: Zone[Range]) = {
    _userRangeZone = z
  }
  private def userCloseCombatZone_(z: Zone[CloseCombat]) = {
    _userCloseCombatZone = z
  }
  private def pcSiegeZone_(z: Zone[Siege]) = {
    _pcSiegeZone = z
  }
  private def pcRangeZone_(z: Zone[Range]) = {
    _pcRangeZone = z
  }
  private def pcCloseCombatZone_(z: Zone[CloseCombat]) = {
    _pcCloseCombatZone = z
  }
  /** Updates the field using double dispatch
   * but i ran out of time to implement this.
   */
  def update(p: IPlayer, z: Zone) = {
    if (p.getClass.toString == "User") {
      if (z.toString == "SiegeZone") {
        userSiegeZone_(p.sz)
      } else if (z.toString == "RangeZone") {
        userRangeZone_(p.sz)
      } else if (z.toString == "CloseCombatZone") {
        userCloseCombatZone_(p.sz)
      }
    } else {
      if (z.toString == "SiegeZone") {
        pcSiegeZone_(p.sz)
      } else if (z.toString == "RangeZone") {
        pcRangeZone_(p.sz)
      } else if (z.toString == "CloseCombatZone") {
        pcCloseCombatZone_(p.sz)
      }
    }
  }

  //  val userSiegeZone: AbstractZone = userField.head
  //  val userRangeZone: AbstractZone = userField(1)
  //  val userCloseCombatZone: AbstractZone = userField(2)
}