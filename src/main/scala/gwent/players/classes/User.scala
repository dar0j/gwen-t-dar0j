package cl.uchile.dcc
package gwent.players.classes

import gwent.cards.ICard
import gwent.cards.classes.units.{CloseCombat, Ranged, Siege}
import gwent.exceptions.ZoneFullException
import gwent.field.Field
import gwent.players.AbstractPlayer

/** The player in the game playing against the computer.
 *
 *  @param _name The name of the player.
 *  @param _deck The deck the user will play with.
 *  @param _hand The hand of the user.
 *  @constructor Creates an user with _name as his name, also initializes a deck and a hand.
 */
class User(private val _name: String,
           private var _deck: List[ICard],
           private var _hand: List[ICard])
  extends AbstractPlayer(_name, _deck, _hand) {

  override def playCard(index: Int, field: Field): Unit = {
    hand(index).toField(this, field)
  }

  override def updateSiegeZone(siege: Siege, field: Field): Unit = {
    try {
      siegeZone.addCard(siege)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.userSiegeZone = siegeZone
  }

  override def updateRangedZone(ranged: Ranged, field: Field): Unit = {
    try {
      rangedZone.addCard(ranged)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.userRangedZone = rangedZone
  }

  override def updateCloseCombatZone(closeCombat: CloseCombat, field: Field): Unit = {
    try {
      closeCombatZone.addCard(closeCombat)
    } catch {
      case zf: ZoneFullException => println(zf.getMessage)
    }
    field.userCloseCombatZone = closeCombatZone
  }

}


