package cl.uchile.dcc

import munit.FunSuite

class computadoraTest extends munit.FunSuite{
  private val n: str = null
  var gemas: int = null
  override def beforeEach(context: BeforeEach): Unit = {
    n=new Computadora()
  }
  test("equals"){
    assertEquals(n,n)
    assertEquals(n, new Computadora())
    assertEquals(!n.equals(n))
  }
}
