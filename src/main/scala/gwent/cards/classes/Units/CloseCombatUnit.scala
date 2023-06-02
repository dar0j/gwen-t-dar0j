package cl.uchile.dcc
package units

import gwent.Units

class CloseCombatUnit(val n: String, f: Int, e: Int = 0) extends Units {
  val name = n
  val zone = "CloseCombat"
  if (e!=0) {
    override def moralBooster() = {

    }
  }
}
