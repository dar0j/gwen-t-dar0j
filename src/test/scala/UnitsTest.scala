package cl.uchile.dcc

import munit.FunSuite

class UnitsTest extends munit.FunSuite{
  private val name: String = null

  override def beforeEach(context: BeforeEach): Unit = {
    n: Units = new Units("u")
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Units("u"))
    assertEquals(!n.equals(n))
  }
}
