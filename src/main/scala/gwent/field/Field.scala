package cl.uchile.dcc
package gwent.field

import gwent.cards.classes.units.{CloseCombat, Ranged, Siege}
import gwent.cards.{IWeather, NullCard}
import gwent.field.zones.Zone

/** Class representing the field in which the cards will be placed and the game will develop. */
class Field(private var _weatherZone: Array[IWeather] = Array[IWeather](NullCard),
            private var _userSiegeZone: Zone[Siege] = new Zone[Siege],
            private var _userRangedZone: Zone[Ranged] = new Zone[Ranged],
            private var _userCloseCombatZone: Zone[CloseCombat] = new Zone[CloseCombat],
            private var _pcSiegeZone: Zone[Siege] = new Zone[Siege],
            private var _pcRangedZone: Zone[Ranged] = new Zone[Ranged],
            private var _pcCloseCombatZone: Zone[CloseCombat] = new Zone[CloseCombat]) {

  /** Gets the current weather field zone. */
  def weatherZone: Array[IWeather] = _weatherZone

  /** Gets the User's Siege Units field zone. */
  def userSiegeZone: Zone[Siege] = _userSiegeZone

  /** Gets the User's Ranged Units field zone. */
  def userRangedZone: Zone[Ranged] = _userRangedZone

  /** Gets the User's Close Combat Units field zone. */
  def userCloseCombatZone: Zone[CloseCombat] = _userCloseCombatZone

  /** Gets the PC's Siege Units field zone. */
  def pcSiegeZone: Zone[Siege] = _pcSiegeZone

  /** Gets the PC's Ranged Units field zone. */
  def pcRangedZone: Zone[Ranged] = _pcRangedZone

  /** Gets the PC's Close Combat Units field zone. */
  def pcCloseCombatZone: Zone[CloseCombat] = _pcCloseCombatZone

  /** Updates the weather of the field. */
  def weatherZone_=(newZone: Array[IWeather]): Unit = {
    _weatherZone = newZone
  }

  /** Sets the User's Siege Zone  */
   def userSiegeZone_=(newZone: Zone[Siege]): Unit = {
    _userSiegeZone = newZone
  }

  /** Sets the User's Ranged Zone  */
  def userRangedZone_=(newZone: Zone[Ranged]): Unit = {
    _userRangedZone = newZone
  }

  /** Sets the User's Close Combat Zone  */
  def userCloseCombatZone_=(newZone: Zone[CloseCombat]): Unit = {
    _userCloseCombatZone = newZone
  }

  /** Sets the PC's Siege Zone  */
  def pcSiegeZone_=(newZone: Zone[Siege]): Unit = {
    _pcSiegeZone = newZone
  }

  /** Sets the PC's Ranged Zone  */
  def pcRangedZone_=(newZone: Zone[Ranged]): Unit = {
    _pcRangedZone = newZone
  }

  /** Sets the PC's Close Combat Zone  */
  def pcCloseCombatZone_=(newZone: Zone[CloseCombat]): Unit = {
    _pcCloseCombatZone = newZone
  }
}