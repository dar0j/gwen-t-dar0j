package cl.uchile.dcc
package gwent.cards.classes.units

import cl.uchile.dcc.gwent.cards.classes.AbstractUnit

class Siege (n: String,
                 f: Int,
                 e: Int = 0)
  extends AbstractUnit(n, f) {
  override val classification = "Siege"
  /*override def moraleBooster(): Unit = {
    for (card <- SiegeZone) {
      card.force += 1
    }
  }*/
}
