package cl.uchile.dcc
package gwent.zones

import cl.uchile.dcc.cards.ICard
import cl.uchile.dcc.gwent.Weather

import scala.collection.mutable.ArrayBuffer

class Field(val pcField: ArrayBuffer[Zone], val userField: ArrayBuffer[Zone]) {
  val weatherZone: ArrayBuffer[Weather]= new ArrayBuffer[Weather](1)

  val userSiegeZone: Zone = userField[0]
  val userRangeZone: Zone = userField[1]
  val userCloseCombatZone: Zone = userField[2]

  val pcSiegeZone: Zone = pcField[0]
  val pcRangeZone: Zone = pcField[0]
  val pcCloseCombatZone: Zone = pcField[0]

}