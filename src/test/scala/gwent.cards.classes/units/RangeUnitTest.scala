package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class RangeUnitTest extends FunSuite{
  val name = "Distancia"
  val force = 10
  var range: RangeUnit = _
  override def beforeEach(context: BeforeEach): Unit = {
    range = new RangeUnit(name, force)
  }
  test("A Range Unit Card can be created with a name.") {
    assertEquals(range.name, name)
  }
}