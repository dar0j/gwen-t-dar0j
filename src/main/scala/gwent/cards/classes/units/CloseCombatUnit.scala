package cl.uchile.dcc
package gwent.cards.classes.units

import cl.uchile.dcc.gwent.cards.classes.AbstractUnit

class CloseCombatUnit(n: String,
                      f: Int,
                      e: Int = 0)
  extends AbstractUnit(n, f) {
  override val classification = "CloseCombat"
/*  if (e!=0) {
    override def moralBooster() = {

    }
  }*/
}
