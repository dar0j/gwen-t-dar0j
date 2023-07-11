package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class SiegeTest extends FunSuite {
  val name1 = "Asedio"
  val name2 = "Siege"

  val force1 = 10
  val force2 = 12

  var range1: Siege = _
  var range2: Siege = _
  var range3: Siege = _

  override def beforeEach(context: BeforeEach): Unit = {
    range1 = new Siege(name1, force1)
    range2 = new Siege(name1, force1)
    range3 = new Siege(name2, force2)

  }
  test("A Siege Unit Card can be created with a name") {
    assertEquals(range1.name, name1)
  }
  test("A Siege Unit should have force points and these should differ from another Siege Unit") {
    assertEquals(range1.force, force1)
    assertNotEquals(range1.force, range2.force)
  }
  test("Two Siege Units with the same name should be the same and have the same force") {
    assertEquals(range1, range2)
    assertEquals(range2, range1)
    assertNotEquals(range1, range3)
    assertNotEquals(range3, range1)
  }
}