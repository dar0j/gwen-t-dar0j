package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class SiegeUnitTest extends FunSuite {
  val name = "Asedio"
  val force = 10
  var siege: SiegeUnit = _
  override def beforeEach(context: BeforeEach): Unit = {
    siege = new SiegeUnit(name, force)
  }
  test("A Siege Unit Card can be created with a name.") {
    assertEquals(siege.name, name)
  }
}
