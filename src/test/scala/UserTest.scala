package cl.uchile.dcc

import  munit.FunSuite

class usuarioTest extends munit.FunSuite{
  private val n: str = null
  var gemas: int = null

  override def beforeEach(context: BeforeEach): Unit = {
    n = new Jugador()
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Jugador())
    assertEquals(!n.equals(n))
  }
}
