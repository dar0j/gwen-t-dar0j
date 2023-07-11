package cl.uchile.dcc
package gwent.cards.classes.units

import cl.uchile.dcc.gwent.cards.classes.AbstractUnit

class CloseCombat(n: String,
                  f: Int)
  extends AbstractUnit(n, f) {
  override val classification = "CloseCombat"
}
