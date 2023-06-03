package cl.uchile.dcc
package gwent.cards.classes

import munit.FunSuite

class WeatherTest extends FunSuite {
  val name = "clima"
  var weather: Weather = _
  override def beforeEach(context: BeforeEach): Unit = {
    weather = new Weather(name)
  }
  test("A Weather Card can be created with a name.") {
    assertEquals(weather.name, name)
  }
    //assertEquals(n, n)
    //assertEquals(n, new Weather("despejado"))
    //assertEquals(!n.equals(n))
}
