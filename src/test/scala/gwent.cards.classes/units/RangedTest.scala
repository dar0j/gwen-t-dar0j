package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class RangedTest extends FunSuite {
  val name1 = "Distancia"
  val name2 = "Ranged"

  val force1 = 10
  val force2 = 12

  var ranged1: Ranged = _
  var ranged2: Ranged = _
  var ranged3: Ranged = _

  override def beforeEach(context: BeforeEach): Unit = {
    ranged1 = new Ranged(name1, force1)
    ranged2 = new Ranged(name1, force1)
    ranged3 = new Ranged(name2, force2)

  }
  test("A Ranged Unit Card can be created with a name") {
    assertEquals(ranged1.name, name1)
  }
  test("A Ranged Unit should have force points and these should differ from another Ranged Unit") {
    assertEquals(ranged1.force, force1)
    assertNotEquals(ranged1.force, ranged2.force)
  }
  test("Two Ranged Units with the same name should be the same and have the same force") {
    assertEquals(ranged1, ranged2)
    assertEquals(ranged2, ranged1)
    assertNotEquals(ranged1, ranged3)
    assertNotEquals(ranged3, ranged1)
  }
}