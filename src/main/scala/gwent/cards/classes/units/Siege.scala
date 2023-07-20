package cl.uchile.dcc
package gwent.cards.classes.units

import gwent.cards.classes.AbstractUnit
import gwent.field.Field
import gwent.players.IPlayer
import gwent.cards.effects.IEffect

class Siege (name: String,
             force: Int,
             effect: IEffect)
  extends AbstractUnit(name, force, effect) with IEffect {

  override val classification = "Siege"

  override def effect(): Unit = ???

  override def toField(player: IPlayer, field: Field): Unit = {
    player.updateSiegeZone(this, field)
  }
}
/*override def moraleBooster(): Unit = {
  for (card <- SiegeZone) {
    card.force += 1
  }
}*/