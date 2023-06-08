package cl.uchile.dcc
package gwent.players

import cl.uchile.dcc.gwent.cards.ICard
import cl.uchile.dcc.gwent.cards.classes.units.{CloseCombat, Range, Siege}
import cl.uchile.dcc.gwent.field.zones.{Hand, IZone, Zone}
import cl.uchile.dcc.gwent.field.Deck

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**Interface that indicates the parameters and methods a player has.*/
trait IPlayer {

  val name: String

  protected val gems: Int

  protected val deck: ArrayBuffer[ICard]

  protected val hand: Hand

  val ccz: Zone[CloseCombat]
  val rz: Zone[Range]
  val sz: Zone[Siege]

  def play(): Unit

  def draw(): Unit
}
