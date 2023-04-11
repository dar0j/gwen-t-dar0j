package cl.uchile.dcc

import munit.FunSuite

class unidadTest extends munit.FunSuite{
  private val nombre: str = null

  override def beforeEach(context: BeforeEach): Unit = {
    n = new Unidad("depejado")
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Unidad("despejado"))
    assertEquals(!n.equals(n))
  }
}
