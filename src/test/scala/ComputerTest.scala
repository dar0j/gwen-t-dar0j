package cl.uchile.dcc

import munit.FunSuite

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
