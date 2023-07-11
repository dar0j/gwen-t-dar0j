package cl.uchile.dcc
package gwent.cards.classes.units

import gwent.cards.classes.AbstractUnit
import cl.uchile.dcc.gwent.cards.classes.effects.CloseBond

class CloseCombatEffCB(n: String,
                       f: Int)
  extends AbstractUnit(n, f) with CloseBond {
  override val classification = "CloseCombat"
  /*  if (e!=0) {
      override def moralBooster() = {

      }
    }*/
}
