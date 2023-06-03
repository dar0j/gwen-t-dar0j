package cl.uchile.dcc
package gwent.field

import cl.uchile.dcc.gwent.field.zones.fieldZone
import cl.uchile.dcc.gwent.cards.classes.Weather
import cl.uchile.dcc.gwent.cards.classes.units.{CloseCombatUnit, RangeUnit, SiegeUnit}
import cl.uchile.dcc.gwent.players.IPlayer

import scala.collection.mutable.ArrayBuffer

class Field(var _weatherZone = new ArrayBuffer[Weather](1),
            var _userSiegeZone = new fieldZone[SiegeUnit],
            var _userRangeZone = new fieldZone[RangeUnit],
            var _userCloseCombatZone = new fieldZone[CloseCombatUnit],
            var _pcSiegeZone = new fieldZone[SiegeUnit],
            var _pcRangeZone = new fieldZone[RangeUnit],
            var _pcCloseCombatZone = new fieldZone[CloseCombatUnit]) {
  def weatherZone_(n) = {
    _weatherZone = n
  }
  def userSiegeZone_(n) = {
    _userSiegeZone = n
  }
  def userRangeZone_(n) = {
    _userRangeZone = n
  }
  def userCloseCombatZone_(n) = {
    _userCloseCombatZone = n
  }
  def pcSiegeZone_(n) = {
    _pcSiegeZone = n
  }
  def pcRangeZone_(n) = {
    _pcRangeZone = n
  }
  def pcCloseCombatZone_(n) = {
    _pcCloseCombatZone = n
  }
  /** Updates the field using double dispatch
   * but i ran out of time to implement this.
   */
  def update(p: IPlayer, z: fieldZone) = {
    if (p.getClass = "User") {
      if (z == "SiegeZone") {
        userSiegeZone_(p.sz)
      } else if (z == "RangeZone") {
        userRangeZone_(p.sz)
      } else if (z == "CloseCombatZone") {
        userCloseCombatZone_(p.sz)
      }
    } else {
      if (z == "SiegeZone") {
        pcSiegeZone_(p.sz)
      } else if (z == "RangeZone") {
        pcRangeZone_(p.sz)
      } else if (z == "CloseCombatZone") {
        pcCloseCombatZone_(p.sz)
      }
    }
  }

  //  val userSiegeZone: AbstractZone = userField.head
  //  val userRangeZone: AbstractZone = userField(1)
  //  val userCloseCombatZone: AbstractZone = userField(2)
}