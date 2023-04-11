package cl.uchile.dcc

import munit.FunSuite

class climaTest extends munit.FunSuite{
  private val nombre: str = null

  override def beforeEach(context: BeforeEach): Unit = {
    n = new Clima("depejado")
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Clima("despejado"))
    assertEquals(!n.equals(n))
  }
}
