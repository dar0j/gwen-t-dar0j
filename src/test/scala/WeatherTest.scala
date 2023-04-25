package cl.uchile.dcc

import munit.FunSuite

class WeatherTest extends munit.FunSuite{
  private val nombre: String = null

  override def beforeEach(context: BeforeEach): Unit = {
    n: Weather = new Weather("despejado")
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Weather("despejado"))
    assertEquals(!n.equals(n))
  }
}
