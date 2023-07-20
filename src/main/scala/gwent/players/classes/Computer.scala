package cl.uchile.dcc
package gwent.players.classes

import gwent.cards.ICard
import gwent.cards.classes.units.{CloseCombat, Siege, Ranged}
import gwent.cards.classes.weathers.{BitingFrost, ClearWeather, ImpenetrableMist, TorrentialRain}
import gwent.field.Field
import gwent.players.AbstractPlayer

import cl.uchile.dcc.gwent.exceptions.ZoneFullException

/** The computer in the game playing against a player has defined its name and deck.
 *
 *  @param _deck The deck the computer will play with.
 *  @param _hand The hand.
 *  @constructor Initializes the computer player with the name "COM".
 */
class Computer(private var _deck: List[ICard],
               private var _hand: List[ICard])
  extends AbstractPlayer("COM", _deck, _hand) {

  override def playCard(index: Int, field: Field): Unit = {
    hand(index).toField(this, field)
  }

  override def updateSiegeZone(siege: Siege, field: Field): Unit = {
    try {
      siegeZone.addCard(siege)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.pcSiegeZone = siegeZone
  }

  override def updateRangedZone(ranged: Ranged, field: Field): Unit = {
    try {
      rangedZone.addCard(ranged)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.pcRangedZone = rangedZone
  }

  override def updateCloseCombatZone(closeCombat: CloseCombat, field: Field): Unit = {
    try {
      closeCombatZone.addCard(closeCombat)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.pcCloseCombatZone = closeCombatZone
  }

}