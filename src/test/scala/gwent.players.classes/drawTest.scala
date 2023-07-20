package cl.uchile.dcc

import munit.FunSuite
class drawTest extends FunSuite{
  override def beforeEach(context: BeforeEach): Unit = {
    d: Deck =  new Deck(List(Weather("c"), Weather("b"), Weather("a")))
  }

  test("draw") {
    assertEquals( d, draw(new Deck( List(Weather("c"), Weather("b")), 1, new Deck(Weather("a")) )) )
  }
}
