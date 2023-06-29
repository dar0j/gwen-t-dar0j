package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class RangeTest extends FunSuite {
  val name1 = "Distancia"
  val name2 = "Range"

  val force1 = 10
  val force2 = 12

  var range1: Range = _
  var range2: Range = _
  var range3: Range = _

  override def beforeEach(context: BeforeEach): Unit = {
    range1 = new Range(name1, force1)
    range2 = new Range(name1, force1)
    range3 = new Range(name2, force2)

  }
  test("A Range Unit Card can be created with a name") {
    assertEquals(range1.name, name1)
  }
  test("A Range Unit should have force points and these should differ from another Range Unit") {
    assertEquals(range1.force, force1)
    assertNotEquals(range1.force, range2.force)
  }
  test("Two Range Units with the same name should be the same and have the same force") {
    assertEquals(range1, range2)
    assertEquals(range2, range1)
    assertNotEquals(range1, range3)
    assertNotEquals(range3, range1)
  }
}