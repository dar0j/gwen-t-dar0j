package cl.uchile.dcc
package gwent.cards.classes.units

import munit.FunSuite

class CloseCombatTest extends FunSuite {
  val name1 = "Cuerpo A Cuerpo"
  val name2 = "Close Combat"

  val force1 = 10
  val force2 = 12

  var closecombat1: CloseCombat = _
  var closecombat2: CloseCombat = _
  var closecombat3: CloseCombat = _

  override def beforeEach(context: BeforeEach): Unit = {
    closecombat1 = new CloseCombat(name1, force1)
    closecombat2 = new CloseCombat(name1, force1)
    closecombat3 = new CloseCombat(name2, force2)

  }
  test("A Close Combat Unit Card can be created with a name") {
    assertEquals(closecombat1.name, name1)
  }
  test("A Close Combat Unit should have force points and these should differ from another Close Combat Unit") {
    assertEquals(closecombat1.force, force1)
    assertNotEquals(closecombat1.force, closecombat2.force)
  }
  test("Two Close Combat Units with the same name should be the same and have the same force") {
    assertEquals(closecombat1, closecombat2)
    assertEquals(closecombat2, closecombat1)
    assertNotEquals(closecombat1, closecombat3)
    assertNotEquals(closecombat3, closecombat1)
  }
}