package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class CloseCombatUnitTest extends FunSuite {
  val name = "CuerpoACuerpo"
  val force = 10
  var closecombat: CloseCombatUnit = _
  override def beforeEach(context: BeforeEach): Unit = {
    closecombat = new CloseCombatUnit(name, force)
  }
  test("A Close Combat Unit Card can be created with a name.") {
    assertEquals(closecombat.name, name)
  }
}