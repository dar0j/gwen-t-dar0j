package cl.uchile.dcc
package gwent.cards.classes.units

import cl.uchile.dcc.gwent.cards.classes.AbstractUnit

class RangeUnit (n: String,
                 f: Int,
                 e: Int = 0)
  extends AbstractUnit(n, f) {
  override val classification = "Range"
}
