package cl.uchile.dcc
package gwent.cards.classes.units

import gwent.cards.classes.AbstractUnit
import gwent.cards.effects.IEffect
import gwent.field.Field
import gwent.players.IPlayer

class Ranged (name: String,
             force: Int,
             effect: IEffect)
  extends AbstractUnit(name, force, effect) with IEffect {

  override val classification = "Ranged"

  override def effect(): Unit = ???

  override def toField(player: IPlayer, field: Field): Unit = {
    player.updateRangedZone(this, field)
  }
}