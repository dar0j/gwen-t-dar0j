package cl.uchile.dcc

import  munit.FunSuite

class userTest extends munit.FunSuite{
  private val n: String = null
  var gems: Int = null

  override def beforeEach(context: BeforeEach): Unit = {
    n = new Player()
  }

  test("equals") {
    assertEquals(n, n)
    assertEquals(n, new Player())
    assertEquals(!n.equals(n))
  }
}
