package cl.uchile.dcc
package gwent.players

import cl.uchile.dcc.gwent.cards.classes.units.{CloseCombatUnit, RangeUnit, SiegeUnit}
import cl.uchile.dcc.gwent.field.zones.{Hand, IZone, fieldZone}
import cl.uchile.dcc.gwent.field.Deck

import scala.collection.mutable.ListBuffer

/**Interface that indicates the parameters and methods a player has.*/
trait IPlayer {
  val name: String
  protected val gems: Int
  protected val deck: Deck
  protected val hand: Hand
  val ccz: fieldZone[CloseCombatUnit]
  val rz: fieldZone[RangeUnit]
  val sz: fieldZone[SiegeUnit]
  def play(): Unit
  def draw(): Unit
}
