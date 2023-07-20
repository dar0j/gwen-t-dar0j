package cl.uchile.dcc
package gwent.cards.classes.units

import gwent.cards.classes.AbstractUnit
import gwent.cards.effects.IEffect
import gwent.field.Field
import gwent.players.IPlayer

class CloseCombat (name: String,
                   force: Int,
                   effect: IEffect)
  extends AbstractUnit(name, force, effect) with IEffect {

  override val classification = "Close Combat"

  override def effect(): Unit = ???

  override def toField(player: IPlayer, field: Field): Unit = {
    player.updateCloseCombatZone(this, field)
  }
}
/*class CloseCombatEffCB(n: String,
                       f: Int)
  extends AbstractUnit(n, f) with CloseBond {
  override val classification = "CloseCombat"
  /*  if (e!=0) {
      override def moralBooster() = {

      }
    }*/
}*/
