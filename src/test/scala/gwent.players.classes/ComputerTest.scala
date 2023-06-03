package cl.uchile.dcc
package players

import munit.FunSuite

class ComputerTest extends FunSuite {
  val n: String = "Some"
  var some: Some = _
  override def beforeEach(context: BeforeEach): Unit = {
    some = new Some(name)
  }
  test("A Computer player can be created with a name") {
    assertEquals(some.name, name)
  }
}
class ComputerTest extends munit.FunSuite{
  private val n: String = null
  var gems: Int = null
  override def beforeEach(context: BeforeEach): Unit = {
    n: Computer = new Computer()
  }
  test("equals"){
    assertEquals(n,n)
    assertEquals(n, new Computer())
    assertEquals(!n.equals(n))
  }
}
